import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int a[]=new int[n];
		long b[]=new long[n+2];
		long s=0;
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			b[a[i]]++;
		}
		for(int i=0;i<=n;i++)s+=b[i]<2?0:b[i]*(b[i]-1)/2;
		for(int i=0;i<n;i++)System.out.println(s-b[a[i]]+1);
	}
}
