import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int L = sc.nextInt();
		int s = 0;
		int b = 1000;
		sc.close();
		for(int i=1; i<=N; i++) {
			int c = L + i -1;
			if(Math.abs(c)<Math.abs(b)) {
				b = c;
			}
		}
		for(int i=1; i<=N; i++) {
			s += L + i -1;
		}
		s -= b;
		System.out.println(s);
	}

}