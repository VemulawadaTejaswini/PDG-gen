import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		double [] pp = new double[t];
		for(int i=0;i<t;i++) {
			pp[i] = 0;
		}
		double PP = 0;
		for(int i=0;i<t;i++) {
			int n = sc.nextInt();
			int m = sc.nextInt();
			for(int j=0;j<m;j++) {
				int v = sc.nextInt();
				double r = sc.nextDouble();
				pp[i] += v*r;
				PP += r;
			}
			pp[i] /= PP;
			PP = 0;
		}
		double pph = 0;
		double R = 0;
		int p = sc.nextInt();
		int q = sc.nextInt();
		for(int i=0;i<q;i++) {
			int v = sc.nextInt();
			double r = sc.nextDouble();
			pph += v*r;
			R += r;
		}
		pph /= R;
		/*for(int i=0;i<t;i++) {
			System.err.print(pp[i]+" ");
		}
		System.err.println(pph);*/
		
		for(int i=0;i<t;i++) {
			if(pp[i]-pph > 0.0000001) {
				System.out.println("YES");
				return;
			}
		}
		System.out.println("NO");
	}
}
