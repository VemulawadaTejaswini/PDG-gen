import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int A = sc.nextInt();
		int output = N * N - A;
		// 文字列の入力
		String s = Integer.toString(output);
		// 出力
		System.out.println(s);
	}
}