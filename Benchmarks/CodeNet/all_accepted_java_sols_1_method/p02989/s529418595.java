import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		int[]d = new int[n];
		for(int i = 0; i < n; i++) {
			d[i] = stdIn.nextInt();
		}
		
		Arrays.parallelSort(d);
		long cnt = 0;
		
		for(int i = d[n/2-1]+1; i <=d[n/2];i++) {
			cnt++;
		}
		
		System.out.println(cnt);
		
	}

}
