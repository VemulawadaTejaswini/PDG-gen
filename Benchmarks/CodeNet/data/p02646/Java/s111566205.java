import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();
		int v = sc.nextInt();
		int b = sc.nextInt();
		int w = sc.nextInt();
		int t = sc.nextInt();

		if (Math.abs(a-b) <= Math.abs(v*t-w*t)) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}

        sc.close();
	}
}