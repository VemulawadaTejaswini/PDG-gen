import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int n = sc.nextInt();
		String s1 = sc.next();
		String s2 = sc.next();
		StringBuilder sb = new StringBuilder();
		String res = "";
		for(int i=0;i<n;i++) {
			sb.append(s1.charAt(i));
			sb.append(s2.charAt(i));
		}
		res = sb.toString();
		// 出力
		System.out.println(res);

		//scclose
		sc.close();
	}

}
