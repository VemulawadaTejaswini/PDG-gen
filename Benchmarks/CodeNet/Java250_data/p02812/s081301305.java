import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		String S = sc.next();
		sc.close();

		int count = 0;
		for(int i = 0; i < N - 2; i++) {
			String tmp = S.substring(i, i + 3);
			if(tmp.equals("ABC")) {
				count++;
			}
		}
		System.out.println(count);
	}
}