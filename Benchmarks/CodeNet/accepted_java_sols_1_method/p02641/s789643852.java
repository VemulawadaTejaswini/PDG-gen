import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		int p[] = new int[n];
		for(int i=0; i<n;i++) {
			p[i] = sc.nextInt();
		}

		Arrays.sort(p);
		
//		for(int i=0; i<n;i++) {
//			System.out.println(p[i]);
//		}

		boolean flg = true;
		for(int i=0; i<n;i++) {
			if(x == p[i]) {
				flg = false;
				break;
			}
		}
		if(flg == true) {
			System.out.println(x);
			System.exit(0);;
		}

		int xx =0;
		for(int i=1; i<100; i++) {
			xx = x - i;
			flg = true;
			for(int j=0; j<n;j++) {
				if(xx == p[j]) {
					flg = false;
					break;
				}
			}
			if(flg == true) {
				System.out.println(xx);
				System.exit(0);;
			}
			
			xx = x + i;
			flg = true;
			for(int j=0; j<n;j++) {
				if(xx == p[j]) {
					flg = false;
					break;
				}
			}
			if(flg == true) {
				System.out.println(xx);
				System.exit(0);;
			}
			
		}

	}
	
}
