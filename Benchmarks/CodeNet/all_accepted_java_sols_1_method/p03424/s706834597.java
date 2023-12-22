import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// // 整数の入力
		// int a = sc.nextInt();
		// // スペース区切りの整数の入力
		// int b = sc.nextInt();
		// int c = sc.nextInt();
		// // 文字列の入力
		// String s = sc.next();
		// // 出力
    // System.out.println((a+b+c) + " " + s);
		int N = sc.nextInt();
		Set<String> se = new HashSet<>();
		for (int i=0; i<N; i++) {
			String S = sc.next();
			se.add(S);
		}
		System.out.println(se.size() == 3 ? "Three" : "Four");
	}
}