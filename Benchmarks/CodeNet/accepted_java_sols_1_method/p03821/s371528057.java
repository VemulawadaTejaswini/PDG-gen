import java.util.*;
 
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long[] a=new long[n];
		long[] b=new long[n];
		long ans=0;
		for(int i=0; i<n; i++){
			a[i] = Long.parseLong(sc.next());
			b[i] = Long.parseLong(sc.next());
		}
 
		for(int i=n-1;i>=0;i--){
			a[i] += ans;
		        ans += (a[i]+b[i]-1)/b[i]*b[i]-a[i];
		}
 
		System.out.println(ans);
		return;
	}
}