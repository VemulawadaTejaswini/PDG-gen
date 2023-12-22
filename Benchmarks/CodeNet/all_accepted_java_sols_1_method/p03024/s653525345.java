import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int k = S.length();
		S = S.replaceAll("x", "");
		if(S.length() >= 7) {
			System.out.println("YES");
		}else if(k - S.length() >= 8){
			System.out.println("NO");
		}else {
			System.out.println("YES");
		}
		sc.close();
	}

}