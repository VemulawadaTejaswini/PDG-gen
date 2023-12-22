import java.util.Arrays;
import java.util.Scanner;
public class Main{

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int k = stdIn.nextInt(); //選ぶ本数
		int[]h = new int[n];
		
		for(int i = 0; i < n; i++) {
			h[i] = stdIn.nextInt();
		}
		Arrays.sort(h);
		
		int [] dif = new int[n-1];
		long max = Long.MAX_VALUE;
		dif[0] = h[1]-h[0];
		for(int i = 1; i < n-1; i++) {
			dif[i] = h[i+1] - h[i];
		}
		
		int[] s = new int[n];
		s[0] = 0;
		for(int i = 1; i < n; i++) {
			s[i] = s[i-1]+dif[i-1];
		}
		
		
		for(int i = 0; i < n-k+1; i++) {
			max = Math.min(max, s[i+k-1]-s[i]);
		}
		System.out.println(max);
	}

}
