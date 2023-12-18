import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int x = sc.nextInt();
		int y = sc.nextInt();
		int ans = 0;
		if (n>k) {
			ans = k*x+(n-k)*y;
		}else {
			ans = n*x;
		}
		System.out.println(ans);
	}

}