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
    String N = sc.next();
    if (N.charAt(0) == N.charAt(1) && N.charAt(0) == N.charAt(2)) {
      System.out.println("Yes");
    } else if (N.charAt(1) == N.charAt(2) && N.charAt(1) == N.charAt(3)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
	}
}