import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if (n >= 400 && n <= 599) {
			System.out.println("8");
		} else if (n >= 600 && n <= 799) {
			System.out.println("7");
		} else if (n >= 800 && n <= 999) {
			System.out.println("6");
		} else if (n >= 1000 && n <= 1199) {
			System.out.println("5");
		} else if (n >= 1200 && n <= 1399) {
			System.out.println("4");
		} else if (n >= 1400 && n <= 1599) {
			System.out.println("3");
		} else if (n >= 1600 && n <= 1799) {
			System.out.println("2");
		} else if (n >= 1800 && n <= 1999) {
			System.out.println("1");
		}
	}
}
