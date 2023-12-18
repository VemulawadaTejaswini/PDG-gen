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

		Arrays.fill(A,0);

		for(int i = 0;i < q;i++) {
			switch(scan.nextInt()) {
			case 0:
				add(scan.nextInt(),scan.nextInt());
				break;
			case 1:
				getSum(scan.nextInt(),scan.nextInt());
				break;
			}
		}

		scan.close();
	}

	private void add(int i,int x) {
		A[i-1] += x;
	}

	private void getSum(int s,int t) {
		int sum = 0;
		for(int i = s-1;i <= t-1;i++) {
			sum += A[i];
		}
		System.out.println(sum);
	}
}

