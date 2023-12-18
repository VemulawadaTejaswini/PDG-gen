import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		StringBuffer sb = new StringBuffer(S);
		sb.insert(3, 8);
		sb.deleteCharAt(4);
		String ans = sb.toString();
		System.out.println(ans);
		sc.close();
	}
}
