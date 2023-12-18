import java.util.Scanner;

public class Main {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		String s = sc.next();
		int cntA = 0;
		for(int i = 0; i < 3; ++i) {
			if(s.charAt(i) == 'A') {
				cntA++;
			}
		}
		String ans = (cntA % 3 != 0) ? "Yes" : "No";
		System.out.println(ans);
	}

}
