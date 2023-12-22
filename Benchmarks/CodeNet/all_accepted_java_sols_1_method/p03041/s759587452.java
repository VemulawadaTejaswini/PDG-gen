import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		int N = 0;
		int K = 0;
		String S;
		Scanner sc = new Scanner(System.in);
		N = Integer.parseInt(sc.next());
		K = Integer.parseInt(sc.next());
		S = sc.next();
		StringBuilder sb = new StringBuilder();
		sb.append(S);
		char s;
		String lower;
		s = sb.charAt(K-1);
		lower=String.valueOf(s);
		sb.setCharAt(K-1, (lower.toLowerCase()).toCharArray()[0]);
		System.out.println(sb.toString());

	}

}