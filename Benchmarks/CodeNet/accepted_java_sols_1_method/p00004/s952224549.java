import java.io.*;
import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner stdIn= null;
		stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
		
		double[][] x = new double[10000][6];
		int i = 0;
		while( stdIn.hasNext() ){
			if( stdIn.hasNextDouble() ){
				for(int j = 0; j < 6; j++){
					x[i][j] = stdIn.nextDouble();
				}
			}else{
				stdIn.next();
			}
			i++;
		}
		for(int j = 0; j < i; j++){
			double denom = x[j][0]*x[j][4] - x[j][1]*x[j][3];
			double numX = x[j][2]*x[j][4] - x[j][1]*x[j][5];
			double numY = x[j][0]*x[j][5] - x[j][2]*x[j][3];
			
			double ansX = numX == 0 ? Math.abs(numX/denom) : numX/denom;
			double ansY = numY == 0 ? Math.abs(numY/denom) : numY/denom;
			System.out.printf("%.3f %.3f%n",ansX, ansY);
		}
	}
}