import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			Scanner sc = new Scanner(System.in);
			int N = sc.nextInt();
			int A[] = new int[N];
			for (int i = 0;i < N;i++) {
				A[i] = sc.nextInt();
			}
			//max
			int max = 0;
			for(int i = 0;i < N;i++) {
				max = Math.max(max, A[i]);
			}

			int min = max;
			for(int i = 0;i < N;i++) {
				min = Math.min(min, A[i]);
			}
			System.out.println(max-min);


	}
}