import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int x1 = sc.nextInt();
		int x2 = sc.nextInt();
		int x3 = sc.nextInt();
		int x4 = sc.nextInt();
		int x5 = sc.nextInt();
		if (x1 == 0) {
			System.out.println(1);
		} else if (x2 == 0) {
			System.out.println(2);
		} else if (x3 == 0) {
			System.out.println(3);
		} else if (x4 == 0) {
			System.out.println(4);
		} else {
			System.out.println(5);
		}
	}
}
