import java.util.Scanner;

public class Main {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt() - 1;
		String S = sc.next();
		sc.close();
		String[] s = S.split("");
		s [K] = s[K].toLowerCase();
		StringBuffer bf = new StringBuffer();
		for(int i=0;i<N;i++) {
			bf.append(s[i]);
		}
	System.out.print(bf.toString());
	}
}