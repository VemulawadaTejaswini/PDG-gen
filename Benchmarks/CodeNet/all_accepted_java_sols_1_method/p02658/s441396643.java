import java.util.*;

public class Main {
	

	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		long end=1;
		for(int i=0;i<18;i++) {
			end*=10;
		}
		
		long ans=1;
		
		long[] a=new long[n];
		
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
			if(a[i]==0) {
				System.out.println(0);
				System.exit(0);
			}
		}
		
		for(int i=0;i<n;i++) {
			if(a[i]>end) {
				System.out.println(-1);
				System.exit(0);
			}
		}
		Arrays.sort(a);
		
		for(int i=0;i<n;i++) {
			if(a[i]<=Math.floor(end/ans)) {
				ans*=a[i];
			}
			else {
				ans=-1;
				break;
			}
		}
		
		System.out.println(ans);
	}

}

