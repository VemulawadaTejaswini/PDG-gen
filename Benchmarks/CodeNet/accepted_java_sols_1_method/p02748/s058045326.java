import java.util.Scanner;

// https://atcoder.jp/contests/hitachi2020/tasks/hitachi2020_b
public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int M = sc.nextInt();


		int minA = 100000;
		int[] arrayA = new int[A];
		for(int i=0;i<A;i++) {
			arrayA[i] = sc.nextInt();
			minA = Math.min(minA, arrayA[i]);
		}

		int minB = 100000;
		int[] arrayB = new int[B];
		for(int i=0;i<B;i++) {
			arrayB[i] = sc.nextInt();
			minB = Math.min(minB, arrayB[i]);
		}

		int[] arrayX = new int[M];
		int[] arrayY = new int[M];
		int[] arrayC = new int[M];
		for(int i=0;i<M;i++) {
			arrayX[i] = sc.nextInt();
			arrayY[i] = sc.nextInt();
			arrayC[i] = sc.nextInt();
		}

		sc.close();

		int ans = minA + minB;
		for(int i=0;i<M;i++) {
			int a = arrayA[arrayX[i]-1]+arrayB[arrayY[i]-1]-arrayC[i];
			ans = Math.min(ans,a);

		}

		System.out.println(ans);
	}
}
