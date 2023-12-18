import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		int[] vol=new int[n+1];
		int two=1;
		vol[0]=1;
		for(int i=0; i<=n; i++){
			a[i]=sc.nextInt();
			if(a[i]>vol[i]){
				System.out.println(-1);
				return;
			}
			if(i!=n){
				vol[i+1]=Math.min(100000000,two=(two-a[i])*2);
				two=Math.min(100000000,two);
			}
		}
		System.out.println(-1);
		return;
		long ans=0;
		long num=0;
		for(int i=n; i>=0; i--){
			num+=a[i];
			num=Math.min(vol[i],num);
			ans+=num;
		}
		System.out.println(ans);
	}
}
