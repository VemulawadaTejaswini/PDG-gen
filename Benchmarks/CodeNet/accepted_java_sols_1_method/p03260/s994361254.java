import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の標準入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		// 入力した整数の積が偶数かどうか
		if(a * b % 2 == 0) {
			System.out.println("No");
		} else {
			System.out.println("Yes");
		}
		sc.close();
	}
}