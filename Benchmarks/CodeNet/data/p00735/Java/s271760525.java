
import java.util.Arrays;
import java.util.Scanner;

public class Main {

//	public static int[] ans;
//	public static int c=0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		while(true) {
			n = sc.nextInt();
			if(n == 1) {break;}
			int[] ans = new int[500];
			int c=0;
			
			c = calc1(n,c,ans);
			c = calc6(n,c,ans);
			
			Arrays.sort(ans);
			
			System.out.print(n + ":");
			for(int i=500-c; i<500;i++) {
				System.out.print(" " + ans[i]);
			}
			System.out.println("");
		}
		sc.close();
	}
	

	static int calc1(int n, int c,int[] ans) {
		
		for(int i=8;i<=n; i+=7) {
			if(n % i == 0) {
				if(check(i)) {
					ans[c++] = i;
				}
			}
		}
		
		return c;
	}

	static int calc6(int n, int c,int[] ans) {

		for(int i=6;i<=n; i+=7) {
			if(n % i == 0) {
				if(check(i)) {
					ans[c++] = i;
				}
			}
		}
		
		return c;
	}
	
	static boolean check(int n) {

		for(int i=8;i<n; i+=7) {
			if(n % i == 0) {
				return false;
			}
		}
		for(int i=6;i<n; i+=7) {
			if(n % i == 0) {
				return false;
			}
		}
		
		return true;
	}

}
