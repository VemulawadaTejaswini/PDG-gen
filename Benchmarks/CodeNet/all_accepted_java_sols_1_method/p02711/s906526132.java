import java.util.Scanner;

public class Main {
//java11
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		String N = sc.next();

		String ans = "No";
		for(int i=0; i<3; i++) {
			if(N.charAt(i) == '7') {
				ans="Yes";
				break;
			}
		}

		System.out.println(ans);
	}

}
