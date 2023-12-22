import java.util.Scanner;

public class Main {
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int a = sc.nextInt();

		if (a == 0) {
			System.out.println(1);
		} else if (a == 1) {
			System.out.println(0);
		}
	}
}