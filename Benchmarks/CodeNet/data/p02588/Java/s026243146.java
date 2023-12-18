import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		new Main().run();
	}
	
	void run() {
		Scanner sc = new Scanner(System.in);
		int N=sc.nextInt();
		long[][] cnt=new long[20][20];
		long ans=0;
		for (int i=0;i<N;++i) {
			double A=sc.nextDouble();
			int c5=-9,c2=-9;
			long a=(long)(A*1e9+.1);
			while (c5<9 && a%5==0) {
				++c5;
				a/=5;
			}
			while (c2<9 && a%2==0) {
				++c2;
				a/=2;
			}
			for (int u=-10;u<10;++u) {
				for (int v=-10;v<10;++v) {
					if (u+c2>=0&&v+c5>=0) ans+=cnt[u+9][v+9];
				}
			}
			cnt[c2+9][c5+9]++;
		}
		System.out.println(ans);
	}
}
