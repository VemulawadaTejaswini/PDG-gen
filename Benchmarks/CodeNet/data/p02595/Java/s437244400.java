import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long d=sc.nextInt();
		long[] x=new long[n];
		long[] y=new long[n];
		for(int i=0;i<n;i++) {
			x[i]=sc.nextLong();
			y[i]=sc.nextLong();
		}
		int ct=0;
		long c=d*d;
		for(int j=0;j<n;j++) {
		
		if(c>=x[j]*x[j]+y[j]*y[j]) {
			ct++;
		}
		}
		System.out.println(ct);
		sc.close();
	}
}
