import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		System.out.println(a == 7 || a == 5 || a == 3 ? "YES" : "NO");
		sc.close();
	}

}
