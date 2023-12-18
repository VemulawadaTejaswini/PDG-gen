import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if(n==0) break;
			int [][] info = new int[n][n];
			for(int i=0;i<n;i++) {
				for(int j=0;j<n;j++) {
					info[i][j] = 0;
				}
			}
			int [] leak = new int[n];
			for(int i=0;i<n;i++) {
				int m = sc.nextInt();
				for(int j=0;j<m;j++) {
					info[i][j] = sc.nextInt();
				}
				Arrays.sort(info[i]);
			}
			int k = sc.nextInt(); 
			for(int i=0;i<k;i++) {
				leak[i] = sc.nextInt();
			}
			int count1 = 0;
			int count2 = 0;
			int ans = -1;
			for(int i=0;i<n;i++) {
				for(int j=0;j<k;j++) {
					if(Arrays.binarySearch(info[i], leak[j])>=0) count1++;
				}
				if(count1 == k) {
					count2++;
					ans = i+1;
				}
				count1 = 0;
			}
			if(count2 == 1 || count2 == 0) {
				System.out.println(ans);
			}else {
				System.out.println("-1");
			}
		}				
	}
}

