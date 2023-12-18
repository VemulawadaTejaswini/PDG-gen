import java.util.Scanner;

public class Main {
	static int n,k,m,l,a,b;
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		n=sc.nextInt();
		int ans=0;
		int v[]=new int[n];
		int c[]=new int[n];
		for(int i=0;i<n;i++) {
			v[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			c[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++) {
			if(v[i]-c[i]>0)ans+=v[i]-c[i];
		}
		System.out.println(ans);
    }
}
