import java.util.Scanner;

public class Main {
	public static int flag=0;
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int n, q, m, i;
		n = scan.nextInt();
		int[] A = new int[n];
		for (i = 0; i < n; i++) {
			A[i] = scan.nextInt();
		}
		q = scan.nextInt();
		for (i = 0; i < q; i++) {
			m = scan.nextInt();
			flag=0;
			work(n, 0, A, m);
			if(flag==1) {
				System.out.println("yes");
			}
			else {
				System.out.println("no");
			}
		}
		scan.close();
	}

	public static void work(int num, int sum, int[] A, int m) {
		if (num!=0 && sum<m) {
			work(num - 1, sum, A, m);
			work(num - 1, sum + A[num - 1], A, m);
		}
		else if (sum == m) {
			flag=1;
		}
	}
}
