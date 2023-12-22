import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader; 
public class Main  
{ 
    public static void main(String[] args) throws IOException  
    { 
        //Enter data using BufferReader 
        BufferedReader reader =  
                   new BufferedReader(new InputStreamReader(System.in)); 
         
        // Reading data using readLine 
        String input = reader.readLine(); 
      	int n = Integer.valueOf(input);
      	int res = n % 2 == 0 ? n / 2 : n /2 + 1;
  
        // Printing the read line 
        System.out.println(res);         
    } 
} 