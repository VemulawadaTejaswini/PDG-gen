import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long s = 0;

		int[] numArr = new int[100005];

		for (int i = 0; i < n; i++) {
			int a = sc.nextInt();
			numArr[a] ++;
			s+=a;
		}

		int q = sc.nextInt();
		int[][] qs = new int[q][2];
		for (int i = 0; i < q; i++) {
			qs[i][0] = sc.nextInt();
			qs[i][1] = sc.nextInt();
		}

		for (int i = 0; i < qs.length; i++) {
			int b = qs[i][0];
			int c = qs[i][1];

			long bCnt = numArr[b];
			long bMinus = bCnt*b;
			numArr[b] = 0;

			long cPlus = bCnt*c;
			numArr[c] +=bCnt;

			s -=bMinus;
			s +=cPlus;

			System.out.println(s);
		}
	}

}