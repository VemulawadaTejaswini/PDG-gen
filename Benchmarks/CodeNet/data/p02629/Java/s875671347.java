import java.util.Scanner;
import java.util.Arrays;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		String alpha = "abcdefghijklmnopqrstuvwxyz";
		String out = "";

		// 整数の入力
		int a = sc.nextInt();//番号
		int b = 0;
		while (a > 26) {
			b = a;
			out = String.valueOf(alpha.charAt(b%26-1)) + out;
			a = a / 26;
		}
		out = String.valueOf(alpha.charAt(a-1)) + out;
		System.out.println(out);
	}
}