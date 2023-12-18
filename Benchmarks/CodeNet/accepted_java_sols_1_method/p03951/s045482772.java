import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		String t = sc.next();
		int d = 0;
		for (; d<N; d++) {
			String ss = s.substring(d);
			String tt = t.substring(0, N-d);
			if (ss.equals(tt)) break;
		}
		System.out.println(N+d);
		sc.close();
	}

}
