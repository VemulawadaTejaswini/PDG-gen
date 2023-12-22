import java.io.*;
import java.util.*;

public class Main{

      public static void main(String []args)/*throws IOException*/{
        
        /*
        InputStreamReader reader=new InputStreamReader(System.in);
 
        BufferedReader input =
			new BufferedReader (new InputStreamReader (System.in));
			
		int key = reader.read();
		String str = input.readLine();
		*/
		Scanner stdIn = new Scanner(System.in);
		
		int x,ans;
		
		x = stdIn.nextInt();
        int b_max = (int)Math.sqrt(x);
		ans = 1;
        if(x >= 4){
		for(int i = 2;i <= b_max;i++){
		    for(int j = 2;Math.pow(i,j) <= x;j++){
		        if(ans < Math.pow(i,j))
		            ans = (int)Math.pow(i,j);
		    }
		}
        }
	    
		System.out.println(ans);
	
     }
}