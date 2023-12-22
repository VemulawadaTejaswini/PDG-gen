
import java.util.*;


public class Main {
	
	
	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);
		
		int n = s.nextInt();
		int[] a = new int[n+1];
		for(int i = 1;i<=n;i++)a[i] = s.nextInt();
		int c=  0;
		
		Arrays.sort(a,1,n+1);
		
		// 1 4 4 6 7 9
		int l = a[n/2], h = a[n/2+1] ;
		for(int i = a[n/2]-1; i<=a[n/2 +1] ; i++)
		{
			if(l<=i && h > i)c++;
		}
		
		 System.out.println(c);
	}
}
