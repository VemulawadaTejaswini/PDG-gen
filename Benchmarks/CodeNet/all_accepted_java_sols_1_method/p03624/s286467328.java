import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		char[] ch = "abcdefghijklmnopqrstuvwxyz".toCharArray();

		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		sc.close();

		String ans = "None";
		for(int i = 0;i < ch.length;i++) {
			if(!S.contains(String.valueOf(ch[i]))) {
				ans = String.valueOf(ch[i]);
				break;
			}
		}
		System.out.println(ans);
	}
}