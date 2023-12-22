import java.util.*;

public class Main {
	public static void main(String[] args)  {
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int[] a=new int [n+2];
		int sum_yen=0;
		Arrays.fill(a, 0);
		for (int i= 1; i <= n; ++i ){
			a[i] = Integer.parseInt(scan.next());
			sum_yen+=Math.abs(a[i-1]-a[i]);
		}
		sum_yen+=Math.abs(a[n]-a[n+1]);
		int diff;
		int ans;
		for (int i=1;i<n+1;++i){
			diff=Math.abs(a[i-1]-a[i])+Math.abs(a[i]-a[i+1]);
			ans=sum_yen-diff+Math.abs(a[i-1]-a[i+1]);
			System.out.println(ans);
		}





	}
}
//end