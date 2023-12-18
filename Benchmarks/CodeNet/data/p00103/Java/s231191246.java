import java.io.*;
import java.util.*;
 
  
  
  
public class Main {
     
   // private static List<String> base = new ArrayList<String>();
   // private static int score = 0;
      
    public static void main(String[] args) {
         
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
          
            String str;
            int out = 0;
            int runner = 0;
            int score = 0;
           
            	while(true)
            	{
            		str=br.readLine();
            		
                	if(str.equals("HIT"))
                	{
                		if(runner==3)
                		{
                			score++;
                		}
                		else
                		{
                			runner++;
                		}
                	}
                 
                	if(str.equals("HOMERUN"))
                	{
                     
                		score += runner + 1;
                		runner = 0;
                     
                	}
                 
                	if(str.equals("OUT"))
                	{
                		out++;
            
                	}
                	
                	if(out==3)
                	{
                		break;
                	}
      
            	}
          
           
            System.out.println(score);  
        }catch (Exception e) {
            e.printStackTrace();
        }
         
    }
      
   /* private static void calHit() {
         
       if(base.size()==0 || base.size()==1 || base.size()==2)
       {
          base.add("Runner");
       }
        
       else if(base.size()==3)
       {
         score++;
       }
        
    }
      
    private static void calHomerun() {
         
         score = score+base.size()+1;
         base.clear();
          
   }*/
}