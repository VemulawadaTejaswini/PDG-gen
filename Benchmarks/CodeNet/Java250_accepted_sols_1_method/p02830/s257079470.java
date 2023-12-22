import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String str = sc.next();
		String str2 = sc.next();
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			sb.append(str.charAt(i));
			sb.append(str2.charAt(i));
		}
		System.out.println(sb.toString());
	}
}