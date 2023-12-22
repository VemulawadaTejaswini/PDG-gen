import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] a =new int [n+1];
		int[] b =new int [n];
		for(int i=0;i<n+1;++i) {
			a[i]=Integer.parseInt(scan.next());
		}
		for(int i=0;i<n;++i) {
			b[i]=Integer.parseInt(scan.next());
		}
		
		long ans=0;
		int old=0;
		for (int i=0;i<n;++i) {
			ans+=Math.min(a[i], b[i]);
			ans+=Math.min(a[i+1],b[i]-Math.min(a[i], b[i]));
			a[i+1]-=Math.min(a[i+1],b[i]-Math.min(a[i], b[i]));
			
			//System.out.println(ans);
		}
		//ans+=Math.min(a[n], old);
		

		System.out.print(ans);
		
}
}
//end