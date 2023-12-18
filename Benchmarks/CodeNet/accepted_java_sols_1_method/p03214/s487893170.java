import java.util.Scanner;

public class Main{
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int[] A = new int[N];
		double av = 0;
		for(int i = 0;i < N;i++) {
			int a = scn.nextInt();
			av += a;
			A[i] = a;
		}
		av /= (double)N;
		int num = 0;
		double diff = Double.MAX_VALUE;
		for(int i = 0;i < N;i++) {
			int a = A[i];
			if(diff > Math.abs((double)a - av)) {
				diff = Math.abs((double)a - av);
				num = i;
			}
		}

		System.out.println(num);






	}
}
