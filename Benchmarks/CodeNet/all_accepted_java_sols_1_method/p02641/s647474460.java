import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int n = scan.nextInt();
		int[] p = new int[n];
		int ans = x;
		if(n == 0) {
			System.out.println(x);
			System.exit(0);
		}
		int count = 0;
		for(int i=0;i<n;i++) {
			p[i] = scan.nextInt();
		}
		
		for(int j=0;j<=100;j++) {
			boolean b = true;
			for(int k=0;k<n;k++) {
				if(ans == p[k]) {
					b = false;
				}
			}
			if(b) {
				System.out.println(ans);
				System.exit(0);
			}
			if(j % 2 == 0) {
				ans -= j+1;
			}else {
				ans += j+1;
			}
		}

	}

}