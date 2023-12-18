import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		int a, b;
		int d, e;
		float f;
		
		a = scan.nextInt();
		b = scan.nextInt();
		
		d = a / b;
		e = a % b;
		f = (float)a / b;
		
	System.out.println(d + " " + e + " " + f);
		
	}

}