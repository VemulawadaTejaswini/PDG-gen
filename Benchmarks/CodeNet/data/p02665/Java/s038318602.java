import java.util.Scanner;
public class Main {
	public static int pow(int a,int i) {
		int ans=1;
		for(int j=1;j<=i;j++) {
			ans*=a;
		}
		return ans;
	}
		public static int gaus(int a) {
			if(a%2==0) {
				return a/2;
			}
			else {
				return a/2+1;
			}
		}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n+1];
		for(int i=0;i<n+1;i++) {
			a[i]=sc.nextInt();
		}
		int l[]=new int[n+1];
		for(int i=0;i<n+1;i++) {
			l[i]=pow(2,i)-a[i];
		}
		int ans=1;
		int v[]=new int[n+2];
		v[n+1]=0;
		outside:for(int i=n-1;i>=0;i--) {
			v[i+1]=a[i+1]+v[i+2];
			int x=v[i+1];
			for(int j=1;j<=gaus(x);j++) {
				if(gaus(v[i+1])>l[i]) {
					v[i+1]--;
				}
				else {
					ans+=v[i+1];
					break;
				}
				if(j==gaus(x)) {
					ans=-1;
					break outside;
				}
			}
		}
		System.out.println(ans);
		}
		
}