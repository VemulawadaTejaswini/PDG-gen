import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int w = sc.nextInt();
		String ini ="";
		for(int i = 0; i < S.length(); i+=w) {
			ini += S.substring(i, i + 1);
		}
		System.out.println(ini);
		}

}
