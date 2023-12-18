import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int N = scn.nextInt();
		int M = scn.nextInt();
		int K = scn.nextInt();
		int[] arrN = new int[N];
		int[] arrM = new int[M];
		for (int i = 0; i < N; i++) {
			arrN[i] = scn.nextInt();
		}
		for (int i = 0; i < M; i++) {
			arrM[i] = scn.nextInt();
		}
		Arrays.parallelSort(arrN);
		Arrays.parallelSort(arrM);
		int i = 0;
		int count = 0;
		while (K >= 0) {
			if (i == arrN.length) {
				break;
			}
			if (K - arrN[i] >= 0) {
				K = K - arrN[i];
				count++;
			} else {
				break;
			}
			i++;
		}
		int j = 0;
		while (K >= 0) {
			if (j == arrM.length) {
				break;
			}
			if (K - arrM[j] >= 0) {
				K = K - arrM[j];
				count++;
			} else {
				break;
			}
			j++;
		}
		System.out.println(count);
	}
}