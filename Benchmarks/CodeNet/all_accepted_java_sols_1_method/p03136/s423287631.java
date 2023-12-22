import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[] L = new int[N];
		int sum = 0;
		for(int i = 0; i < N; i++) {
			L[i] = sc.nextInt();
			sum += L[i];
		}
		sc.close();
		Arrays.sort(L);
		sum -= L[N - 1];
		if(L[N - 1] < sum) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
	}
}