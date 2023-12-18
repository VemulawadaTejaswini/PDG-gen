import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int a = s.nextInt();
		int b = s.nextInt();
		if (-1000 > a || a > 1000 || b < -1000 || b > 1000) {
			System.out.println("有効範囲は-1000=<a,b<=1000です。");
			;
		} else if (a < b) {
			System.out.println("a < b");
		} else if (a > b) {
			System.out.println("a > b");
		} else {
			System.out.println("a == b");
		}
	}

}

