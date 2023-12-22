
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int d = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println((n == 100? 101 : n)*(int)Math.pow(100, d));
	}
}
