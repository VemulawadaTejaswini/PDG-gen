import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		double r = sc.nextInt();
		double p = Math.PI;

		System.out.printf("%6f %6f",(double)r*r*p,(double)2*r*p);
	}
}