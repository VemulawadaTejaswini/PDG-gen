import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = sc.nextInt();
		sc.close();
		do {
			c -= b; // 高橋くんの攻撃
			if(c <= 0) break;
			a -= d; // 青木くんの攻撃
		} while(a > 0);
		System.out.println(a > 0 ? "Yes" : "No");
	}
}
