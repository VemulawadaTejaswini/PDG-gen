import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int x = 0;

		for(int i = 1;i <= c; i++) {
			if(c % i == 0 && (a <= i && b >= i)) {
				x++;
			}
		}

		System.out.println(x);
	}

}
