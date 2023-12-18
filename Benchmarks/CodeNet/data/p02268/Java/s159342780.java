import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main
{
	public static void main(String[] args)throws Exception
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n  = Integer.parseInt(br.readLine());
		String[] g  = br.readLine().split(" ");
		int [] ar = new int[n];
		for( int i = 0 ; i< n ; i++){
			ar[i] = Integer.parseInt(g[i]);
		}
		int m  = Integer.parseInt(br.readLine());
		int ans = 0;
		g  = br.readLine().split(" ");
		for(int i = 0 ; i <m; i++)
		{
			if(binarySearch(ar,Integer.parseInt(g[i])) != -1) ans++ ;	
		}
		System.out.println(ans);
	}
	public static int binarySearch(int[] c, int key)
	{
		int len = c.length;
		int left = 0 , right = len;
		int mid = (right + left) / 2 ;
		while(left < right){
			if(c[mid] == key) return mid;
			else if(c[mid] < key) left = mid+1;
			else { right = mid;  }
			mid = (right + left) / 2 ;
		}
		return -1;
	}
	
}