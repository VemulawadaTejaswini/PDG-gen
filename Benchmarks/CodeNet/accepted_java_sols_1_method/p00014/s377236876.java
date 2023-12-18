import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		int[] result = new int[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				int d = 0;
				if( stdIn.hasNextInt() ){
					d = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				
				int n = 600/d;
				result[index] = d*d*d*(n-1)*n*(2*n-1)/6;
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