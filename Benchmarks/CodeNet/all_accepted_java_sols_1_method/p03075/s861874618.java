import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		sc.nextInt();
		int e = sc.nextInt();
		int k = sc.nextInt();

		System.out.println(e - a > k ? ":(" : "Yay!");

	}

}