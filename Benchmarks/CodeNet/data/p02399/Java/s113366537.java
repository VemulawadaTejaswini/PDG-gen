import java.util.Scanner;

public class Main {
	public static void main(String [] args){
		Scanner scan = new Scanner(System.in);
		
		int a = scan.nextInt();
		int b = scan.nextInt();
		
		int d=0, r=0;
		double f=0.00000; 
		
		d = a/b;
		r = a%b;
		f = (double)a/b;
		
		System.out.println(d+" "+r+" "+String.format("%5f", f));	
	}
}