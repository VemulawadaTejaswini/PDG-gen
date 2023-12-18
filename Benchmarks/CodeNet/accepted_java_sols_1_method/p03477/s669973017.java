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
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int D = sc.nextInt();
    if (A + B > C + D) {
      System.out.println("Left");
    } else if (A + B < C + D) {
      System.out.println("Right");
    } else {
      System.out.println("Balanced");
    }
	}
}