import java.util.Scanner;
import java.io.*;

public class Main{
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[] data = new int[100];
		int index = 0;
		int max = 0;
		int[] check = new int[100];
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			while( stdIn.hasNext() ){
				if( stdIn.hasNextInt() ){
					data[index] = stdIn.nextInt();
					check[data[index]-1]++;
					if( check[data[index]-1] > max ){
						max = check[data[index]-1];
					}
				} else {
					stdIn.next();
				}
				index++;
			}
			
			for(int i = 0; i < 100; i++){
				if( check[i] == max ){
					System.out.println(i+1);
				}
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}