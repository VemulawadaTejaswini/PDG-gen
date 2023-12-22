import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		sc.close();
		for(int i = 1; i <= 1009; i++) {
			int a = (int)(i * 0.08);
			int b = (int)(i * 0.10);
			if(a == A && b == B) {
				System.out.println(i);
				return;
			}
		}
		System.out.println(-1);
	}
}