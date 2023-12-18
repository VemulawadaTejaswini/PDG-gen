import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextDouble();
		
		double S = r * r * 3.14;
		double L = 2 * r * 3.14;
		
		System.out.println(S+" "+L);
	}
}