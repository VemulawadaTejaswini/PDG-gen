import java.util.Scanner;
import java.lang.Math;

public class Main {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int a;
		a = input.nextInt();
		System.out.println((int)(a + Math.pow(a,2) + Math.pow(a,3)));
	}
}
