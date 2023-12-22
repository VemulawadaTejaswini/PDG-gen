import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int K = sc.nextInt();
		int a = 0;
		
		if((K % 2) == 0) {
			a = (K / 2) * (K / 2);
		} else {
			int b = (K - 1) / 2;
			a = (b + 1) * b;
		}
		System.out.println(a);
	}
}
