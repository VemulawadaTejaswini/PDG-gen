import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		if(x ==1) {
			System.out.println(b - a + 1);
			return;
		}
		// b をxで割った数
		long bx = b/x;
		// a未満の数 をxで割った数
		long ax = (a-1)/x;
		if(a ==0) {
			System.out.println(bx + 1);
			return;
		}
		System.out.println(bx - ax);
	}
}