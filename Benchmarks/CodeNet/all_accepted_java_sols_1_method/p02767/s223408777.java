import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N=Integer.parseInt(sc.next());
		int[] x = new int[N];
		for(int i=0; i<N; i++) {
			x[i]=Integer.parseInt(sc.next());
		}
		int minimum =Integer.MAX_VALUE;
		for(int i=1; i<=100; i++) {
			int total = 0;
			for(int aa:x) {
				total +=(aa-i) * (aa-i);
			}
			minimum = Math.min(total, minimum);
		}
		System.out.println(minimum);
	}
}
