import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		sc.close();

		String[] sArray = s.split("");
		String[] tArray = t.split("");

		int ans = 0;
		for(int i = 0;i<sArray.length;i++) {
			if(!(sArray[i].equals(tArray[i]))) {
				ans ++;
			}
		}
		System.out.println(ans);

	}
}
