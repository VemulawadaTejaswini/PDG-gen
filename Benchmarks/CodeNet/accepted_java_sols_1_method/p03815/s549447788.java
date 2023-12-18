import java.util.*;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong();
		long ans = 0;
		ans += 2*(x/11);
		x = x%11;
	//	System.out.println(ans);
	//	System.out.println(x);
		if(x>=1) {
			ans += 1;
			x -= 6;
		}
		if(x>=1) {
			ans += 1;
			x -= 5;
		}
		System.out.println(ans);
	}

}