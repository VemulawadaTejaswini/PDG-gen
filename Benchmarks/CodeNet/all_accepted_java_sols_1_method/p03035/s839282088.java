import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();

		if(a >= 13) {
			System.out.println(b);
		}else if(a <= 12 && a >=6) {
			System.out.println(b/2);
		}else {
			System.out.println(0);
		}
	}
}