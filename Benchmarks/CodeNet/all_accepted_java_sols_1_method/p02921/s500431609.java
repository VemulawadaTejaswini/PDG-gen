import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws Exception {
		Scanner sc = new Scanner(System.in);
		String A = sc.next();
		String B = sc.next();
		int res = 0;
		for (int i = 0; i < A.length(); i++) {
			if (A.charAt(i) == B.charAt(i)) {
				res++;
			}
		}
		System.out.println(res);
	}
}
