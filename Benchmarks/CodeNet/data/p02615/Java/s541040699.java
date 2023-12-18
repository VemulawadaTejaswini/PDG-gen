import java.util.*;
import java.io.PrintWriter;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		long ans=a[n-1];
		int ind=n-2;
		int tind=n-5;;
		for(int i=n-3; i>=0; i--){
			if(ind==tind){
				ind--;
				tind=i-2;
			}
			ans+=a[ind];
		}
		System.out.println(ans);
	}
}
