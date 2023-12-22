import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();

		int ans=1000;
		int len = t.length();

		String[] arrayT = t.split("");
		for(int i=0;i<=s.length()-len;i++) {
			int tmp = 0;
			String str = s.substring(i, i+len);
			String[] arrayS = str.split("");
			for(int j=0;j<len;j++) {
				if(!arrayS[j].equals(arrayT[j])) {
					tmp++;
				}
			}
			ans = Math.min(tmp, ans);

		}

		System.out.println(ans);

	}
}
