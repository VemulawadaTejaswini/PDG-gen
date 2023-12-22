import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int X = sc.nextInt();
		int Y = sc.nextInt();

		int leg = 0;
		String ans = "No";

		for (int t=0; t<X+1; t++) {
			leg = 2*t + 4*(X-t);
			if (leg==Y) {
				ans="Yes";
				break;
			}
		}

		if (ans=="Yes") {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}


	}

}