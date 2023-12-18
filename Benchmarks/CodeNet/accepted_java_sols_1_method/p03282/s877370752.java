import java.util.Scanner;

public class Main {
	static long K;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		K = sc.nextLong();

		String s = String.valueOf(S);
		String[] sarray = s.split("");
		String ans = "1";
		for (int i = 0; i < K; i++) {
			if (!sarray[i].equals("1")) {
				ans = (sarray[i]);
				break;
			}
		}
		System.out.println(ans);
	}
}