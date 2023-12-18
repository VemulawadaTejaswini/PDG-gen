import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    
	private static List<String> base = new ArrayList<String>();
	private static int score = 0;
     
    public static void main(String[] args) {
        
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
             
            String str;
            int out = 0;
                        
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
            System.out.println(score);
           
        }catch (Exception e) {
            e.printStackTrace();
        }
        
    }
     
    public static void calHit() {
         
       if(base.size()==0 || base.size()==1 || base.size()==2)
       {
    	  base.add("Runner");
       }
       
       else
       {
    	 score++;
       }
       
    }
     
    public static void calHomerun() {
    	
    	 score = score+base.size()+1;
    	 base.clear();
         
   }
}