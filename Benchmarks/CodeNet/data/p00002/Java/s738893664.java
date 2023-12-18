import java.io.*;
import java.util.Scanner;

public class Main{
	static int digit(int a, int b){
		int x = a + b;
		int d = 0;
		while( x > 0 ){
			d++;
			x /= 10;
		}
		return d;
	}

	public static void main(String[] args) throws IOException {
		Scanner stdIn = null;
		
		final int NUM = 1000;
		int[][] p = new int[NUM][2];
		
		try{
			stdIn = new Scanner(new BufferedReader(new FileReader("in1.txt")));
	
			int i = 0;
	
			while( stdIn.hasNext() ){
				if( stdIn.hasNextInt() ){
					p[i][0] = stdIn.nextInt();
					p[i][1] = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				i++;
			}
		
			for(int j = 0; j < i; j++){
				System.out.println(digit(p[j][0],p[j][1]));
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}