import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);

		// 整数の入力
		int p = sc.nextInt();
		int q = sc.nextInt();
		int r = sc.nextInt();

		int ans = 0;

		if(p>=q&&p>=r)ans = q+r;
		if(q>=p&&q>=r)ans = p+r;
		if(r>=p&&r>=q)ans = p+q;

		// 出力
		System.out.println(ans);
	}
}