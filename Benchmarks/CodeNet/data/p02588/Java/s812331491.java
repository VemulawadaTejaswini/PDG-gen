import java.util.Arrays;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	long gcd(long a,long b) {
		return a==0?b:gcd(b%a,a);
	}
	
	int[] f(long a) {
		int[] ret=new int[2];
		while (a%2==0 && ret[0]<9) {
			ret[0]++;
			a/=2;
		}
		while (a%5==0 && ret[1]<9) {
			ret[1]++;
			a/=5;
		}
		return ret;
	}

	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[][] cnt=new long[20][20];
		long ans=0;
		for (int i=0;i<N;++i) {
			double a=sc.nextDouble();
			long den=(long)1e9;
			long num=(long)(a*den);
			long gcd=gcd(num,den);
			num/=gcd;
			den/=gcd;
			int[] p=f(num);
			int[] q=f(den);
			for (int u=-10;u<10;++u) {
				for (int v=-10;v<10;++v) {
					if (u+p[0]-q[0]>=0&&v+p[1]-q[1]>=0) 
					ans+=cnt[u+10][v+10];
				}
			}
			cnt[p[0]-q[0]+10][p[0]-q[0]+10]++;
		}		
		System.out.println(ans);
		
	}	
	
	

	void tr(Object... o) {
		System.out.println(Arrays.deepToString(o));
	}

}
