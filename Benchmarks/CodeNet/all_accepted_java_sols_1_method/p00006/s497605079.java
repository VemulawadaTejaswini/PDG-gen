import java.io.*;
import java.util.ArrayList;

public class Main {
	
	
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         
          
            String str;
            ArrayList<Character> array = new ArrayList<Character>();
            
            while((str = br.readLine()) != null)
            {
            	for(int i = str.length()-1; i>=0; i--)
            	{
            	array.add(str.charAt(i));
            	}
            	
            	for(int i = 0; i<array.size();i++)
            	{
            	System.out.print(array.get(i));
            	}
            	System.out.println();
            }
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
   
}