import java.math.*;
import java.util.*;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int p[] = new int[n];
			int mini = 0;
			int count = 0;
			
			for(int i=0;i<n;i++) {
				p[i] = sc.nextInt();
			}
			
			
			
			for(int i=0;i<n;i++) {
				if(i==0) {
					mini = p[i];
				}
				else {
					mini = Math.min(mini, p[i]);
				}
				
				if(mini<p[i]) {
					count++;
				}
			}
			
			System.out.println(n-count);
			
			
		}

	}