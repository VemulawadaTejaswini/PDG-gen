import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		long N = scan.nextLong();
		scan.close();
		String s = Long.toString(N);
		long k = 0;
		for(int i = 0; i < s.length(); i++) {
			int t = Integer.parseInt(s.substring(i, i + 1));
			k += t;
		}
		if(N % k == 0) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

	}
}