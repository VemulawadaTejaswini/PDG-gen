import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		char[] S = sc.next().toCharArray();
		int x = 0;
		int res = 0;
		for (int i=0; i<N; i++) {
			if (S[i] == 'I') x++;
			else x--;
			res = Math.max(res, x);
		}
		System.out.println(res);
	}
}
