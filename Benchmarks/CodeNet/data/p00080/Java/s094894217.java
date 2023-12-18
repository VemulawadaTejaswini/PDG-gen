import java.util.*;

public class Main{
	public static void solve(int n){
		double x = (double) n/2;
		while( Math.abs( x*x*x-n ) >= 0.00001*n ){
			x = 2*x/3 + n/(3*x*x);
		}
		System.out.printf("%.6f%n", x);
	}
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		while( n != -1 ){
			solve(n);
			n = stdIn.nextInt();
		}
	}
}