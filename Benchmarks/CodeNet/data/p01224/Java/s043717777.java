import java.util.Scanner;

public class Main {
	static int yaku(int a) {
		boolean[] y = new boolean[a+1];
		for(int i=2;i<a;i++) {
			y[i] = false;
		}
		int cnt = 1;
		for(int i=2;i<=a/2;i++) {
			if(a/2==0 && i==a/2)
				break;
			if(a%i==0) {
				y[i] = true;
				y[a/i] = true;
			}
		}
		for(int i=2;i<=a/2;i++) {
			if(y[i]) {
				cnt += i;
				if(i!=a/i)
				cnt += a/i;
				y[a/i] = false;
				y[i] = false;
			}
			
		}
		return cnt;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(sc.hasNext()) {
			int n = sc.nextInt();
			if(n==0)break;
			int a = yaku(n);
			if(n==1)
				System.out.println("deficient number");
			else if(a==n)
				System.out.println("perfect number");
			else if(a<n)
				System.out.println("deficient number");
			else if(a>n)
				System.out.println("abundant number");
		}
	
	}
}
