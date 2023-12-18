import java.math.BigInteger;
import java.util.*;
public class Main{
	static Map<Long,ArrayList<String>> l=new TreeMap<Long,ArrayList<String>>();
	static long p[];
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int a[]=new int[100002];
		long sum=0;
		for(int i=0;i<n;i++) {
			int m=sc.nextInt();
			a[m]++;
			sum+=m;
		}
		
		int k=sc.nextInt();
		for(int i=0;i<k;i++) {
			int p=sc.nextInt();
			int q=sc.nextInt();
			int d=a[p];
			sum-=p*d;
			
			int add=q*d;
			sum+=add;
			a[q]+=d;
			
			System.out.println(sum);
		}
	}
	
	
}

 
