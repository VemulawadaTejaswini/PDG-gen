import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int K = sc.nextInt();

		int[] H = new int[N];
		for(int i=0; i<N; i++) {
			H[i] = sc.nextInt();
		}
		Arrays.sort(H);

		long count = 0;
		for(int i=0; i<N -K; i++) {
			count += H[i];
		}
		 System.out.println(count);
	}

}
