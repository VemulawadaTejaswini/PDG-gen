import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		long[] result = new long[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				long a = stdIn.nextLong();
				long b = stdIn.nextLong();
				
				result[index] = a+b;
				index++;
			}
			
			for(int i = 0; i < index; i++){
				System.out.println(result[i]);
			}
		} finally {
 			if( stdIn != null ){
 				stdIn.close();
 			}
 		}
 	}
}