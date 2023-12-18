import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int D = sc.nextInt();
		int X = sc.nextInt();
		int[] ary = new int[N];
		for(int i=0; i<N; i++) {
			ary[i] = sc.nextInt();
		}
		sc.close();
		int d;
		for(int i=0; i<N; i++) {
			d = 0;
			for(int j=1; d<D; j++) {
				d = j*ary[i];
				X++;
			}
		}
		
		System.out.println(X);
	}

}