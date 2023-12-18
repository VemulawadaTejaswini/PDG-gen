import java.util.Arrays;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	private Scanner scan;
	private int n,q;
	private int[] A;

	private void mainrun() {
		scan = new Scanner(System.in);

		n = scan.nextInt();
		q = scan.nextInt();
		A = new int[n];

		Arrays.fill(A,Integer.MAX_VALUE);

		for(int i = 0;i < q;i++) {
			switch(scan.nextInt()) {
			case 0:
				update(scan.nextInt(),scan.nextInt());
				break;
			case 1:
				find(scan.nextInt(),scan.nextInt());
				break;
			}
		}

		scan.close();
	}

	private void update(int i,int x) {
		A[i] = x;
	}

	private void find(int s,int t) {
		int min = A[s];
		for(int i = s + 1;i <= t;i++) {
			min = Math.min(min, A[i]);
		}
		System.out.println(min);
	}
}

