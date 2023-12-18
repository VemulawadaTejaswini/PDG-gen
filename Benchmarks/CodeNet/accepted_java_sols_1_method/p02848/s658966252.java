import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int N = sc.nextInt();
		String S = sc.next();

		for(int i = 0; i < S.length(); i++) {
			if((int)S.charAt(i) + N < 91) {
				sb.append((char)(S.charAt(i) + N));
			}else {
				sb.append((char)((S.charAt(i) + N) % 90 + 64));
			}
		}

		System.out.println(sb.toString());
		sc.close();
	}
}