import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);

		//入力表示
		int A = sc.nextInt();
		int B = sc.nextInt();
		int C = sc.nextInt();
		
	
		int mx = Math.max ( A ,Math.max( B , C ));

		int ans = A + B + C + 9 * mx ;
		System.out.println(ans);
	}
}