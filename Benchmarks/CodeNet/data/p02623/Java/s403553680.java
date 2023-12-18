import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int K = scn.nextInt();
		int[] arrN = new int[N + M];
		for (int i = 0; i < N + M; i++) {
			arrN[i] = scn.nextInt();
		}
		Arrays.parallelSort(arrN);
		int i = 0;
		int count = 0;
		while (K > 0) {
			K = K - arrN[i];
			if(K < 0) {
				break;
			}
			count++;
			i++;
		}
		System.out.println(count);
	}

}
