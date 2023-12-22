
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		long k= sc.nextLong();
		long d;
		boolean[] a=new boolean[n];
		for(int i=0;i<k;i++){
			d=sc.nextLong();
			for(int j=0;j<d;j++){
				a[sc.nextInt()-1]=true;
			}
		}
		long ans=0;
		for(int i=0;i<n;i++){
			if(!a[i]){
				ans++;
			}
		}
		System.out.println(ans);
	}
}
