import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		int m = scan.nextInt();
		int k = scan.nextInt();
		int[] a = new int[n];
		int[] b = new int[m];
		for(int i = 0;i < n; ++i){
			a[i] = scan.nextInt();
		}
		for(int i = 0;i < m; ++i){
			b[i] = scan.nextInt();
		}
		Arrays.sort(a);
		Arrays.sort(b);
		long time = 0;
		int ans = 0;
		int index_a = 0;
		int index_b = 0;
		while(true){
			if(index_a < n && index_b <m && a[index_a] >= b[index_b] && time+b[index_b] <= k){
				time += b[index_b];
				ans++;
				index_b++;
			}else if(index_a<n && time+a[index_a] <= k){
				time += a[index_a];
				ans++;
				index_a++;
			}
			else if(index_b<m && time+b[index_b] <= k){
				time += b[index_b];
				ans++;
				index_b++;
			}
			else{

				break;

			}
		}
		System.out.print(ans);

	}
}