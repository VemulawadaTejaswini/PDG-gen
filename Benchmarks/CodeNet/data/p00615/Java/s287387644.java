import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		while(true){
			int n = sc.nextInt();
			int m = sc.nextInt();
			if(n==0 && m==0) break;
			
			int[] a = new int[n+m];
			for(int i=0;i<n+m;i++) a[i] = sc.nextInt();
			int max = 0;
			Arrays.sort(a);
			for(int i=1;i<n+m;i++) max = Math.max(max, a[i]-a[i-1]);
			if(a.length==1) max = a[0];
			System.out.println(max);
		}	
	}	
}