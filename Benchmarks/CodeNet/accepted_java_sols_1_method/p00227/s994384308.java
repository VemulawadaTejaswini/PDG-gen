import java.util.*;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int n = stdIn.nextInt();
			int m = stdIn.nextInt();
			if(n == 0 && m == 0) {
				break;
			}
			int[] p = new int[n];
			for(int i = 0; i < n; i++) {
				p[i] = stdIn.nextInt();
			}
			Arrays.sort(p);
			int sum = 0;
			int counter = 0;
			for(int i = p.length-1; i >= 0; i--) {
				if(counter == m - 1) {
					counter = 0;
					continue;
				}
				sum += p[i];
				counter++;
			}
			System.out.println(sum);
			
		}
	}
}