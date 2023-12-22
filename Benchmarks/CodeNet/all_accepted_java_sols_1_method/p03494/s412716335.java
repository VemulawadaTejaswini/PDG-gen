import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		
		int[] max = new int[N];
		
		for(int i = 0; i < N; i++) {
			int A = sc.nextInt();
			int count = 0;
			while(A % 2 == 0) {
				count++;
				A /= 2;
			}
			max[i] = count;
		}
		Arrays.sort(max);
		System.out.println(max[0]);
	}
}
