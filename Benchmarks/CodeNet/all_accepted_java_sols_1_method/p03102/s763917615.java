import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int C = sc.nextInt();
		int[] B = new int[M];
		int res = 0;

		for(int i = 0;i<M;i++) {
			B[i] = sc.nextInt();
		}
		for(int j = 0;j<N;j++) {
			int judge = C;
			for(int i = 0;i<M;i++) {
				judge += sc.nextInt()*B[i];
			}
			if(judge > 0) {
				res++;
			}
		}



		System.out.println(res);
	}
}