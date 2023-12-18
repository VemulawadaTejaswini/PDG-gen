import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args){
		Scanner stdIn = null;
		long[] result = new long[10000];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			double v = 0;
			while( stdIn.hasNext() ){
				if( stdIn.hasNextDouble() ){
					v = stdIn.nextDouble();
				} else {
					stdIn.next();
				}
				double h = Math.floor((v*v/98)+1)+1;
				result[index] = (long)h;
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