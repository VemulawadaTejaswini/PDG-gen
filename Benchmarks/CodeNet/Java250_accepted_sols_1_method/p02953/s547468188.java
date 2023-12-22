import java.util.*;

public class Main {
	
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n=Integer.parseInt(scan.next());
		int[] h =new int[n];
		for (int i=0;i<n;++i) {
			h[i]=Integer.parseInt(scan.next());
		}
		
		
		boolean ans=true;
		for(int i=0;i<n-1;++i) {
			if (h[i]<h[i+1]) {
				h[i+1]=h[1+i]-1;
			}else if (h[i]>h[i+1]) {
				ans=false;
		}
		

		}
		
		
		System.out.print(ans?"Yes":"No");

		
}
}
//end