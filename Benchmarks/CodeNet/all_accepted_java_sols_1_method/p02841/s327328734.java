import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int m1 = sc.nextInt();
		int d1 = sc.nextInt();
		int m2 = sc.nextInt();
		int d2 = sc.nextInt();

		if(m1 == 12 && m2 == 1) {
			System.out.println("1");
			return;
		}

		if(m1 < m2) {
			System.out.println("1");
			return;
		}

		System.out.println("0");
	}

}