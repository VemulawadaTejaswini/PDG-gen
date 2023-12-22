import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int T = sc.nextInt();
		int[] c = new int[N];
		int[] t = new int[N];
		int min = 10000;
		for(int i=0; i<N; i++) {
			c[i] = sc.nextInt();
			t[i] = sc.nextInt();
			if(t[i]<=T) {
				if(c[i]<=min) {
					min = c[i];
				}
			}
		}
		sc.close();
		System.out.println(min==10000?"TLE":min);
	}

}