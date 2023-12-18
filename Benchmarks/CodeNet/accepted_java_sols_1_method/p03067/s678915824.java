import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		String out;
		// 文字列の入力
		if((a <= c && c <= b) || (b <= c && c <= a)) {
			out = "Yes";
		}
		else {
			out = "No";
		}
 		// 出力
		System.out.println(out);
	}
}