import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] W = new int[N];
		int s = 1000;
		for(int i=0; i<N; i++) {
			W[i] = sc.nextInt();
		}
		sc.close();
		for(int j=0; j<N; j++) {
			int s1 = 0;
			int s2 = 0;
			for(int i=0; i<j; i++) {
				s1 += W[i];
			}
			for(int i=j; i<N; i++) {
				s2 += W[i];
			}
			if( Math.abs(s1-s2) < s) {
				s = Math.abs(s1-s2);
			}
		}
		System.out.println(s);
	}

}