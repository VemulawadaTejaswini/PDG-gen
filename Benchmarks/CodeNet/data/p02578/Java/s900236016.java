
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
		long a[]=new long[n];
		for(int i=0;i<n;i++) {
			a[i]=sc.nextLong();
		}
		long ans=0;
		long max=a[0];
		for(int i=0;i<n-1;i++) {
			if(a[i]<=a[i+1])
				continue;
			else {
//				System.out.print(max+" ");
				max=Math.max(a[i], max);
				ans+=max-a[i+1];
				
				
			}
		}
		System.out.println(ans);
					
				
			}
		
	}
	   

