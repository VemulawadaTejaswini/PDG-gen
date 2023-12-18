import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		while(true) {
			long[] a=new long[6];
			long[] ichi=new long[3];
			for(int i=0; i<6; i++) {
				a[i]=sc.nextLong();
			}
			int sum=1;
			for(int i=0; i<6; i++) {
				sum*=a[i];
			}
			if(sum==0) {
				System.exit(0);
			}
			else {
				long[] x=new long[(int)a[1]+1];
				long[] y=new long[(int)a[3]+1];
				long[] z=new long[(int)a[5]+1];

				x[0]=0;
				y[0]=0;
				z[0]=0;
				x[1]=a[0]%a[1];
				y[1]=a[2]%a[3];
				z[1]=a[4]%a[5];


				for(int i=2; i<=a[1]; i++) {
					x[i]=(x[i-1]*a[0])%a[1];
					if(x[i]==1) {
						ichi[0]=i;
						break;
					}
				}

				for(int i=2; i<=a[3]; i++) {
					y[i]=(y[i-1]*a[2])%a[3];
					if(y[i]==1) {
						ichi[1]=i;
						break;
					}
				}

				for(int i=2; i<=a[5]; i++) {
					z[i]=(z[i-1]*a[4])%a[5];
					if(z[i]==1) {
						ichi[2]=i;
						break;
					}
				}
			}
			long ans=1L;

			//System.out.println(ichi[0]+" "+ichi[1]+" "+ichi[2]);

			ans=lcm((long)ichi[0],(long)ichi[1]);
			ans=lcm(ans,(long)ichi[2]);

			System.out.println(ans);
		}
	}

	public static long lcm(long m, long n) {
		return m / gcd(m, n)*n;
	}
	public static long gcd(long m, long n) {
		if(m < n) return gcd(n, m);
		if(n == 0) return m;
		return gcd(n, m % n);
	}
}

