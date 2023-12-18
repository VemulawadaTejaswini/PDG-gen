import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long a = sc.nextLong();
		long b = sc.nextLong();
		long x = sc.nextLong();
		long ans = b/x + 1;
		if(a!=0) {
			ans -= (a-1)/x + 1;
		}
		System.out.println(ans);
	}

}