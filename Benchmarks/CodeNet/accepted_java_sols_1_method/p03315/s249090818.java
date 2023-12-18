import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner (System.in);
		// 入力
		String s = sc.next();

		int ans = 0;
		for(int i = 0; i < s.length(); i++){
			//System.out.println(s.charAt(i));
			if (s.charAt(i)=='+') {
				ans++;
			} else {
				ans--;
			}
		}
		// 出力
		System.out.println(ans);
	}
}