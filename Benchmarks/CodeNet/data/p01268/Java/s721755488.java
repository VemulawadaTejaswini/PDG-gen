import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int [] number = new int[1000001];
		number[0] = 1;
		number[1] = 1;
		for(int i=2;i<=1000000;i++) {
			number[i] = 0;
		}
		for(int i=2;i<=500000;i++) {
			for(int j=2;j<=1000000/i;j++) {
				number[i*j] = 1;
			}
		}
		while(true) {
			int n = sc.nextInt();
			int p = sc.nextInt();
			if(n==-1 && p==-1) break;
//			long [] ans = new long[120];
//			for(int i=0;i<100;i++) {
//				ans[i] = 2000000;
//			}
			
			int [] prime = new int[1000001];
			for(int i=0,j=2;j<=1000000;j++) {
	    		if(number[j]==0) {
	    			prime[i] = j;
	    			i++;
	    		}
	    	}

			
			/*for(int i=0;i<a;i++) {
				System.err.printf(prime[i]+" ");
			}*/
				
		   
			List<Integer> ans=new ArrayList<Integer>();
			int a = 0;
			while(prime[a]<=n) a++;
			
			for(int i=a;i<a+p;i++) {
				for(int j=i;j<a+p;j++) {
					ans.add( prime[i] + prime[j]);
				}
			}
//			 for(int i=0;i<120;i++) {
//			    	System.err.print(ans[i]+" ");
//			    }
//			    System.err.println();
			Collections.sort(ans);
			//System.err.println(ans);
			
			System.out.println(ans.get(p-1));
		}
	}
}

