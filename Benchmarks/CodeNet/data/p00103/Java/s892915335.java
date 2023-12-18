import java.io.*;
import java.util.*;
 
  
  
  
public class Main {
     
   // private static List<String> base = new ArrayList<String>();
   // private static int score = 0;
      
    public static void main(String[] args) {
         
        try {
        	
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
           
            int out = 0;
            int runner = 0;
            int score = 0;
            int num = Integer.parseInt(br.readLine());
            
            for(int i=0; i<num; i++)
            {
            	String str;
            	
            	while(out<3)
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
                 
                	else if(str.equals("HOMERUN"))
                	{
                     
                		score += runner + 1;
                		runner = 0;
                     
                	}
                 
                	else
                	{
                		out++;
            
                	}
              
            	}
          
            }
            System.out.println(score);  
        }catch (Exception e) {
            e.printStackTrace();
        }
         
    }