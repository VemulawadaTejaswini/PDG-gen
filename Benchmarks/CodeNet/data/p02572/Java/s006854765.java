import java.util.Scanner;

public class Main2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);

		int N =sc.nextInt();

		Long A[] =new Long[N];

		for(int i=0; i<N; i++) {
			A[i]=sc.nextLong() % 1000000000L;
		}

		Long result = 0L;
		for(int i=0; i<N;i++) {
			for(int j =i+1; j<N; j++) {
				result += A[i]*(A[j]);
			}
		}

		result = result % 1000000007L;
		System.out.println(result);

		sc.close();
	}

}
