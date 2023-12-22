import java.util.Arrays;
import java.util.Scanner;

class Main{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int N=sc.nextInt();
		double[] p=new double[N];
		for(int i=0; i<N; i++) {
			p[i]=sc.nextDouble();
		}
		Arrays.sort(p);
		double ans = 0d;
		ans=p[0];
		for(int i=1; i<N; i++) {
			ans=(ans+p[i])/2.0;
		}
		p(ans);
	}
	public static void p(Object o) {
		System.out.println(o);
	}
}