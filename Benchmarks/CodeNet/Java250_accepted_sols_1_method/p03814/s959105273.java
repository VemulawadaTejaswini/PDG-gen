import java.util.*;

class Main{
	public static void main(String[] $){
		//入力
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		sc.close();

		//処理
		int ans = s.lastIndexOf('Z') - s.indexOf('A') + 1;

		//出力
		System.out.println(ans);
	}
}
