
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int num = b - a - 2;
		int snow = (num + 1) * (num + 2) / 2 - a;
		System.out.println(snow);
	}

}
