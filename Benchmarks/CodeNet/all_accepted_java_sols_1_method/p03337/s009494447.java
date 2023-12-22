import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int ans;
		ans = A+B;
		if(ans<A-B) {
			ans = A-B;
		}
		if(ans<A*B) {
			ans = A*B;
		}
		System.out.println(ans);
	}

}