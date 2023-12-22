import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String[] line = sc.nextLine().split(" ");
		int N = Integer.parseInt(line[0]);
		int M = Integer.parseInt(line[1]);
		int C = Integer.parseInt(line[2]);
		
		line = sc.nextLine().split(" ");
		int[] B = new int[M];
		
		for(int i= 0;i<M;i++) {
			B[i] = Integer.parseInt(line[i]);
		}
		
		int[][] A = new int[N][M];
		for(int i= 0;i<N;i++) {
			line = sc.nextLine().split(" ");
			for(int j= 0;j<M;j++) {
				A[i][j] = Integer.parseInt(line[j]);
			}
		}
		sc.close();
		
		int count =0;
		
		for(int i= 0;i<N;i++) {
			int sum = C;
			for(int j= 0;j<M;j++) {
				sum += A[i][j] * B[j];
			}
			if (sum>0) {
				count ++;
			}
		}
		
		System.out.println(count);

	}

}
