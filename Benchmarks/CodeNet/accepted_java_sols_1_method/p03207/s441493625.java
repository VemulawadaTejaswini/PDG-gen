import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] p = new int[N];
		int max = 0;
		int a = 0;
		for(int i=0; i<N; i++) {
			p[i] = sc.nextInt();
			if(p[i]>=max) {
				max = p[i];
			}
		}
		sc.close();
		for(int i=0; i<N; i++) {
			a += p[i];
		}
		a -= max/2;
		System.out.println(a);
	}

}
