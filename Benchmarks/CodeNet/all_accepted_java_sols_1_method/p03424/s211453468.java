import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String result = "Three";
		for(int i = 0; i < N; i++) {
			String S = sc.next();
			if("Y".equals(S)) {
				result = "Four";
			}
		}
		System.out.println(result);
	}
}
