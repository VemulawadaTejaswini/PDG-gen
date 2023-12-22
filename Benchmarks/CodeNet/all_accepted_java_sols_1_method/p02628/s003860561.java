import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int N = in.nextInt();
		int K = in.nextInt();
		int sum = 0;
		Integer a[] = new Integer[N];
		Integer b[] = new Integer[K];
		
		for(int i = 0;i < N;i++) {
			a[i] = in.nextInt();
		}
		
		Arrays.sort(a,Comparator.naturalOrder());
		
		for(int i = 0;i < K;i++) {
			b[i] = a[i];
		}
		
		for(int i = 0;i < K;i++) {
			sum += b[i];
		}
		
		System.out.println(sum);
	}
}