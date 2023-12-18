import java.io.*;
import java.util.Scanner;

public class Main{
	public static int calculateGCD(int x, int y){
		if( y > x ){
			int temp = x;
			x = y;
			y = temp;
		}
		if( y == 0 ){
			return x;
		} else {
			return calculateGCD(x-y, y);
		}
	}
	
	public static int calculateLCM(int x, int y){
		return x*y/calculateGCD(x, y);
	}
			
	public static void main(String[] args) throws IOException{
		Scanner stdIn = null;
		int[][] result = new int[100][2];
		int index = 0;
		
		try{
			stdIn = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
			int x = 0;
			int y = 0;
			while( stdIn.hasNext() ){
				if( stdIn.hasNextInt() ){
					x = stdIn.nextInt();
					y = stdIn.nextInt();
				} else {
					stdIn.next();
				}
				
				result[index][0] = calculateGCD(x, y);
				result[index][1] = calculateLCM(x, y);
				index++;
			}
			
			for(int i = 0; i < index; i++){
				System.out.println(result[i][0] + " " + result[i][1]);
			}
		} finally {
			if( stdIn != null ){
				stdIn.close();
			}
		}
	}
}