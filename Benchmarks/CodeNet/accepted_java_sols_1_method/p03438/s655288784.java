import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		long[] d=new long[n];
		long e=0;
		long sa=0;
		long sb=0;
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			sa+=a[i];
		}
		for(int i=0;i<n;i++) {
			b[i]=sc.nextLong();
			sb+=b[i];
			d[i]=b[i]-a[i];
			if(d[i]>0)e+=(d[i]+1)/2;
		}
		long c=sb-sa;
		if(c<e) {
			System.out.println("No");
		}
		else {
			System.out.println("Yes");
		}
		
	}
	}
