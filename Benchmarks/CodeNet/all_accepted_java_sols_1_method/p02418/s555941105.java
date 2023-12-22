import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder(sc.nextLine());
		String p = sc.nextLine();
		sb.append(sb);
		String str = sb.toString();
		System.out.println(str.contains(p) ? "Yes" : "No");
	}
}
