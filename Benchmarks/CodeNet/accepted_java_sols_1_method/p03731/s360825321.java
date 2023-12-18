import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String args[]) throws InterruptedException {
		    Scanner sc = new Scanner(System.in);	
			
			int n = sc.nextInt();
			int t = sc.nextInt();
			int[] tim = new int[n];
			int ans = 0;
			for (int i = 0; i < n; i++) {
				tim[i] = sc.nextInt();
			}

			for (int i = 0; i < n; i++) {
				if(i > 0){
					if (tim[i]-tim[i-1] <= t) {
						ans += (tim[i] - tim[i-1]);
					}else{
						ans += t;
					}
				}
			}
			ans += t;

			System.out.println(ans);

		    sc.close(); }
}
