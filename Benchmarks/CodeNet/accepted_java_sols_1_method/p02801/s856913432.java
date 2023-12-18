import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		// 自分の得意な言語で
		// Let's チャレンジ！！

		Scanner sc = new Scanner(System.in);
		String n = sc.next();
		char[] cAr = n.toCharArray();

		System.out.println(++cAr[0]);

	}

}