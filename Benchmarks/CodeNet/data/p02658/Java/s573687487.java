import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		int[] A = new int [N];
		long result = 1;
		long hantei = 1000000000*1000000000;

		for(int i=0;i<N;i++) {
			if(result*A[i] < result && result*A[i] != 0) {
				result = -1;
				break;
			}
			result = result*A[i];
		}
		if(result > hantei) {
			result = -1;
		}
		System.out.println(result);
		stdIn.close();
	}
}
