import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.Math.*;
import java.util.Scanner;
public class Distance {
	static int[] x= new int[2];
	static int[] y = new int[2]; 
	static double dis = 0;
	public static void main(String[] args) throws NumberFormatException, IOException {
	/*	BufferedReader read = new BufferedReader (new InputStreamReader(System.in));
		int a = Integer.parseInt(read.readLine());
		int b = Integer.parseInt(read.readLine());
		*/
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		setX(a,b);
		/*int a1 = Integer.parseInt(read.readLine());
		int b1 = Integer.parseInt(read.readLine());
		*/
		int a1 = scan.nextInt();
		int b1 = scan.nextInt();
		setY(a1,b1);
		calDistance(x,y);
		System.out.println(dis);
	}
	private static double calDistance(int[] x2, int[] y2) {
		double x = x2[0] - y2[0] ; //????????¨????????¢
		double y = x2[1] - y2[1] ;
		
		dis = Math.sqrt(x*x + y*y);
		
		return dis ;
	}
	private static void setY(int a1, int b1) {
		y[0] = a1 ;
		y[1] = b1 ;
	}
	private static void setX(int a, int b) {
		x[0] = a ;
		x[1] = b ;
	}
	

}