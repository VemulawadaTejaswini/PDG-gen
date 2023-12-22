
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] V = new int[N];
		int[] C = new int[N];

		for(int i = 0; i < N; i++) {
			V[i] = sc.nextInt();
		}
		for(int i = 0; i < N; i++) {
			C[i] = sc.nextInt();
		}

		int Vsum = 0;
		int Csum = 0;
		int max = Vsum - Csum;
		for(int i = 0; i < N; i++) {
			Vsum += V[i];
			Csum += C[i];

			if(max < (Vsum - Csum)) {
				max = Vsum - Csum;
			}else {
				Vsum -= V[i];
				Csum -= C[i];
			}

		}

		System.out.println(max);

	}

}
