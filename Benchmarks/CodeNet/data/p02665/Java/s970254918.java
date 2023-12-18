import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int N = Integer.parseInt(sc.next());
		int[] A = new int[N+1];

		for(int i=0; i<N+1; i++) {
			int a = Integer.parseInt(sc.next());
			if(a > 2 || A[0] > 0) {
				System.out.println(-1);
				return;
			}
			A[i] = a;
		}



	}
}
