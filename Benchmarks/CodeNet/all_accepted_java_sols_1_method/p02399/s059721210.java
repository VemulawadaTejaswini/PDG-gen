import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		int a, b;
		int d, e;
		double f;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		d = a / b;
		e = a % b;
		f = (double)a / b;
		
	System.out.println(d + " " + e + " " + String.format("%.09f", f));
		
	}

}