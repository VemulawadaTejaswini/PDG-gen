//package ABC171;
import java.util.*;
import java.io.*;
class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		int n=sc.nextInt();
		int k=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++)
		{
			a[i]=sc.nextInt();
		}
		Arrays.sort(a);
		
		long ans=0;
		for(int i=0;i<k;i++)
		{
			ans+=a[i];
		}
		System.out.println(ans);
	}

}
