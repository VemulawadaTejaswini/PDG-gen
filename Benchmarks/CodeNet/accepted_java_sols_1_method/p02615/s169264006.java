import java.util.*;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] a=new int[n+1];
		
		for(int i=1;i<=n;i++) {
			a[i]=sc.nextInt();
		}
		
		Arrays.sort(a);
		
		long ans=0;
	
		for(int i=1;i<=n-1;i++) {
			//if(i/2==0)ans+=a[n-1];
			ans+=a[n-i/2];
		}
		
	    System.out.println(ans);
	}
}
