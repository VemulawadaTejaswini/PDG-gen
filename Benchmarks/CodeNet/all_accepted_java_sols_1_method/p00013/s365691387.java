import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int len = 0;
			int index = 0;
			int[] cars = new int[10000];
			int[] result = new int[10000];
			
			while( stdIn.hasNext() ){
				int x = 0;
				if( stdIn.hasNextInt() ){
					x = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				if( x == 0 ){
					len--;
					result[index] = cars[len];
					cars[len] = 0;
					index++;
				} else {
					cars[len] = x;
					len++;
				}
			}
			
			for(int i = 0; i < result.length; i++){
				if( result[i] == 0 ){
					break;
				}
				System.out.println(result[i]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}