import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		//数取得
		int A = sc.nextInt();
		int V = sc.nextInt();
		int B = sc.nextInt();
		int W = sc.nextInt();
		int T = sc.nextInt();
		sc.close();

		long distance = Math.abs(B-A);
		int d_verosity = V-W;

		if(distance <= d_verosity * T) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}

}
