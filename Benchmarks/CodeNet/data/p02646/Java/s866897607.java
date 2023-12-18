import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);
		int A = scan.nextInt();
		int V = scan.nextInt();
		int B = scan.nextInt();
		int W = scan.nextInt();
		int T = scan.nextInt();

		int x = B-A;
		if(x<0) {
			x = x*(-1);
		}

		if(V>W) {
			if(x <= (V-W)*T) {
				System.out.println("YES");
			}else {
				System.out.println("NO");
			}
		}else {
			System.out.println("NO");
		}
	}

}