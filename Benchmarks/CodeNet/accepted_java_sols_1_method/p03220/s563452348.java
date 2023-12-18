import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
		int T = sc.nextInt();
		int A = sc.nextInt();
		int[] H = new int[N];
		int result;
		double high;
		for(int i=0; i<N; i++){
			H[i] = sc.nextInt();
		}

		high = T - H[0] * 0.006;
		result = 0;
		for(int i=1; i<N; i++){
			if(Math.abs(high-A) > Math.abs((T - H[i] * 0.006)-A)){
				high = T-H[i] * 0.006;
				result = i;
			}
		}

		System.out.println(result + 1);

	}

}
