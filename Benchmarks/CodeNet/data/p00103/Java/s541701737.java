import java.io.*;
import java.util.ArrayList;
import java.util.List;
 
  
  
  
public class Main {
     
    private static List<String> base = new ArrayList<String>();
    private static int inningScore;
    private static List<Integer> finalScore = new ArrayList<Integer>();  
    public static void main(String[] args) {
         
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
              
            String str;
            int round = Integer.parseInt(br.readLine());             
           
            for(int i = 0; i<round; i++)
            {
            
            	int out = 0;
                inningScore = 0;
                base.clear();
               
                while(out<3)
                {
                 
                str = br.readLine();
                
                if(str.equals("HIT"))
                {
                     
                    calHit();
                     
                }
                 
                if(str.equals("HOMERUN"))
                {
                     
                    calHomerun();
                     
                }
                 
                if(str.equals("OUT"))
                {
                    out++;
     
                }
                
            }
                finalScore.add(inningScore);
           }
             for(int i = 0; i<finalScore.size(); i++)
             {
            	 System.out.println(finalScore.get(i));
             }
            
        }catch (Exception e) {
            e.printStackTrace();
        }
         
    }
      
    private static void calHit() {
          
       if(base.size()==0 || base.size()==1 || base.size()==2)
       {
          base.add("Runner");
       }
        
       else if(base.size()==3)
       {
         inningScore++;
       }
        
    }
      
    private static void calHomerun() {
         
         inningScore = inningScore+base.size()+1;
         base.clear();
          
   }
}