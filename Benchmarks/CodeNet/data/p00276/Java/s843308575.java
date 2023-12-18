import java.util.Scanner;

public class Main {
	static int cca(int c, int a, int n, int count) {
		int maxcount = count;
		if(c >= 2 && a >= 1) {
			int ccac = cca(c-2,a-1,n,count+1);
			int cccc = ccc(c-2,a-1,n,count+1);
			int canc = can(c-2,a-1,n,count+1);
			
			if(maxcount < ccac) maxcount = ccac;
			if(maxcount < cccc) maxcount = cccc;
			if(maxcount < canc) maxcount = canc;
			
			
		}
		return maxcount;
		
	}
	
	static int ccc(int c, int a, int n, int count) {
		int maxcount = count;
		if(c >= 3) {
			int ccac = cca(c-3,a,n,count+1);
			int cccc = ccc(c-3,a,n,count+1);
			int canc = can(c-3,a,n,count+1);
			
			if(maxcount < ccac) maxcount = ccac;
			if(maxcount < cccc) maxcount = cccc;
			if(maxcount < canc) maxcount = canc;
			
			
		}
		return maxcount;
		
	}
	
	static int can(int c, int a, int n, int count) {
		int maxcount = count;
		if(c >= 1 && a >= 1 && n >= 1) {
			int ccac = cca(c-1,a-1,n-1,count+1);
			int cccc = ccc(c-1,a-1,n-1,count+1);
			int canc = can(c-1,a-1,n-1,count+1);
			
			if(maxcount < ccac) maxcount = ccac;
			if(maxcount < cccc) maxcount = cccc;
			if(maxcount < canc) maxcount = canc;
			
			
		}
		return maxcount;
		
	}
	
	static int check(int c, int a, int n) {
		int maxcount = 0;
		int ccac = cca(c,a,n,0);
		int cccc = ccc(c,a,n,0);
		int canc = can(c,a,n,0);
		
		if(maxcount < ccac) maxcount = ccac;
		if(maxcount < cccc) maxcount = cccc;
		if(maxcount < canc) maxcount = canc;
		
		return maxcount;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int Q = stdIn.nextInt();
		int[] c = new int[Q];
		int[] a = new int[Q];
		int[] n = new int[Q];
		for(int i = 0; i < Q; i++) {
			c[i] = stdIn.nextInt();
			a[i] = stdIn.nextInt();
			n[i] = stdIn.nextInt();
		}
		
		for(int i = 0; i < Q; i++) {
			System.out.println(check(c[i],a[i],n[i]));
		}
	}
		
}