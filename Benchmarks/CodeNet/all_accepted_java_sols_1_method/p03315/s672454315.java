import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		int num = 0;
		for (int i = 0; i < S.length(); i++) {
			if (S.charAt(i) == '+') {
				num++;
			} else {
				num--;
			}
		}
		System.out.println(num);
	}
}