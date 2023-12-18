import java.util.Scanner;

public class Main{
		public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean[] uru = new boolean[3001];
		for(int i=0;i<=3000;i++) {
			if(i%4==0   && i%100!=0 || i%400==0)
				uru[i] = true;
			else uru[i] = false;
		}
		int cnt = 0;
		while(true) {
			if(cnt != 0)
				System.out.println();
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n == 0 && m == 0)break;
			
			int ans = 0;
			for(int i=n;i<=m;i++) {
				if(uru[i]) {
					System.out.println(i);
					ans++;
				}
			}
			if(ans == 0)
				System.out.println("NA");
			cnt++;
		}
	}
}

