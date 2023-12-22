import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[2*N];
		for(int i = 0;i < L.length;i++) {
			L[i] = sc.nextInt();
		}
		sc.close();
		Arrays.sort(L);
		int sum = 0;
		for(int i = 0;i < L.length;i+=2) {
			sum += Math.min(L[i], L[i+1]);
		}
		System.out.println(sum);
	}
}