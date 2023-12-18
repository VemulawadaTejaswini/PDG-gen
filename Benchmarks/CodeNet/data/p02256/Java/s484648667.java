import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		System.out.println(getGCD(x, y));
		sc.close();
	}

	public static int getGCD(int a, int b) { // ユークリッドの互除法
		if(a < b) {
			int t = a;
			a = b;
			b = t;
		}
		int c = a % b;
		if(c == 0) {
			return b;
		}else {
			return getGCD(b, c);
		}
	}
}

