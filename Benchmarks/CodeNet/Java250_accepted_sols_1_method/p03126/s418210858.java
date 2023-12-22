import java.util.Arrays;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		int n = stdIn.nextInt();
		int m = stdIn.nextInt();
		
		boolean[] flag = new boolean[m];
		Arrays.fill(flag,true);
		
		for(int i = 0; i < n ; i++) {
			int k = stdIn.nextInt();
			int[]check = new int[k];
			for(int j = 0; j < k; j++) {
				check[j] = stdIn.nextInt();
				
				
				
			}
			
			
			for(int j = 0; j < m; j++) {
				boolean flag2 = false;
				for(int p = 0; p < k; p++) {
					if((j+1)==check[p]) {
						flag2 = true;
					}
				}
				if(!flag2) {
					flag[j] = false;
				}
				
				
				
			}
			
			
		}
		
		long cnt = 0;
		for(int i = 0; i < m; i++) {
			if(flag[i] == true) {
				cnt++;
			}
		}
		System.out.println(cnt);
		
	}

}
