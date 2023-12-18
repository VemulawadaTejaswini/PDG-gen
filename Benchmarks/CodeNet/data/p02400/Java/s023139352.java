import java.util.Scanner;

public class Main {
	public static void main(String args[]){
		Scanner scan = new Scanner(System.in); 
		
		double r;
		double PI = 3.141593;
		
		r = scan.nextInt();
		
		System.out.println(r * r * PI + " " + r * 2 * PI);
		
	}

}