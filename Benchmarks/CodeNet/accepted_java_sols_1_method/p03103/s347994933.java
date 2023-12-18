import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int m = s.nextInt();
		
		long[][] cond = new long[n][2];
		
		long total = 0;
		long amount = 0;
		for(int i=0;i < n; i++) {
			cond[i][0] = s.nextInt();
			cond[i][1] = s.nextInt();
			
		}
		
		Arrays.sort(cond, (a, b) -> Long.compare(a[0], b[0]));
		
		for(long[] shop : cond) {
			for(int j=0;j<shop[1];j++) {
				total = total + shop[0];
				amount++;
				if(amount >=m) {
					System.out.println(total);
					return;
				}
			}
		}

	}

}