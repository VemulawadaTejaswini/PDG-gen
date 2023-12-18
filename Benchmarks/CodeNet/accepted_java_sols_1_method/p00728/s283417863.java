import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			if(n == 0) {
				break;
			}
			int[] o = new int[n];
			int max = -1;
			int min = 9999;
			boolean alMax = false;
			boolean alMin = false;
			for(int i = 0; i < n; i++) {
				o[i] = stdIn.nextInt();
				if(max < o[i]) {
					max = o[i];
				}
				if(min > o[i]) {
					min = o[i];
				}
			}
			int sum = 0;
			Arrays.sort(o);
			for(int i = 1; i < n-1; i++) {
				sum += o[i];
			}
			System.out.println(sum/(n-2));
		}
	}
}