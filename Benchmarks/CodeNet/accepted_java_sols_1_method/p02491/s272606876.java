import java.util.Scanner;

public class Main{
	static Scanner sc = new Scanner(System.in);
	public static void main(String args[]){
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		int d = a / b;
		int r = a % b;
		double f = (double)a / (double)b;
		
		System.out.println(d+" "+r+" "+String.format("%.8f",f));
	}
}