import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt();
		
		int[] p = new int[n];
		
		for(int i = 0; i < n; i++) {
			p[i] = stdIn.nextInt();
		}
		
		Arrays.parallelSort(p);
		
		long cnt = 0;
		
		for(int i = 0; i < k; i++) {
			cnt += p[i];
		}
		
		System.out.println(cnt);
		
	}

}
