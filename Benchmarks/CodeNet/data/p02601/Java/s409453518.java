import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt(); //red
		int b = scan.nextInt(); //green
		int c = scan.nextInt(); //blue
		int k = scan.nextInt();

		for(int i = 1; i <= k; i++) {
			if(a > b) {
				b = 2 * b;
				k = k - 1;
			}

		}

		if(k == 0) {
		System.out.println("No");
		}else if(k != 0) {
			for(int j = 0; j < k; j++) {
				if(b > c) {
					c = 2 * c;
				}
			}
		}
		if(a < b && b < c) {
			System.out.println("Yes");

		}else {
			System.out.println("No");
		}
	}

}
