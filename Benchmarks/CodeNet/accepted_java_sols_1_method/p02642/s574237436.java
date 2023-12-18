import java.util.*;
public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextInt();
		}
		int u[]=new int[1000005];
		int f[]=new int[1000005];
		for(int p:a) {
			if(u[p]==0) {
				u[p]=1;
				for(int j=p*2;j<1000005;j+=p) {
					f[j]=-1;
				}
			}else {
				f[p]=-1;
			}
		}
		int ans=0;
		for(int p:a) {
			if(f[p]!=-1) {
				ans++;
			}
		}
		System.out.println(ans);
	}
	
	

}