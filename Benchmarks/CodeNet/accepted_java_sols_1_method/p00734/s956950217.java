import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(true) {
				int n = sc.nextInt();
				int m = sc.nextInt();
			
				if(n==0 && m==0)	break;
			
				int hsum = 0;
				int tsum = 0;
				int[] taro = new int[n];
				int[] hanako = new int[m];
				for(int i=0; i<n;i++) {
					taro[i] = sc.nextInt();
					tsum += taro[i];
				}
				for(int i=0; i<m; i++) {
					hanako[i] = sc.nextInt();
					hsum += hanako[i];
				}
				int tt = 1000;
				int hh = 1000;
			
				for(int i=0; i<n; i++) {
					for(int j=0; j<m; j++) {
						if(tsum - taro[i] + hanako[j] == hsum - hanako[j] + taro[i] && tt + hh > taro[i] + hanako[j]) {
							tt = taro[i];
							hh = hanako[j];
						}
					}
				}
				if(tt == 1000 && hh == 1000) {
					System.out.println(-1);
				}else {
					System.out.println(tt +" "+hh);
				}
				
				
					
				
			}
			
			
			
			
				
		}
	}
}
