import java.io.*;

public class Main {
	
	
    public static void main(String[] args) {
       
    	try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            String str;
            str = br.readLine();
          
            	for(int i = str.length()-1; i>=0; i--)
            	{
            	System.out.print(str.charAt(i));
            	}
            
    	}catch (Exception e) {
            e.printStackTrace();
        }
       
    }
    
   
}