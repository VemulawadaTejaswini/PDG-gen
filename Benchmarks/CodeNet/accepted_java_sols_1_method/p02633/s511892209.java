
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int sum = X;
		int count = 1;
		while(sum % 360 != 0) {
			sum = sum + X;
			count++;
//			System.out.println(sum);
		}

		System.out.println(count );
	}

}
