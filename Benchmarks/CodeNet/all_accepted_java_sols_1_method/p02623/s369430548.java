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

		long time = 0;//be needed time to read all of A
		for(int i = 0;i < n;++i){
			time += a[i];
		}

		int index_a = n;
		int ans = 0;
		for(int i = 0;i < m+1; ++i){
			while(index_a > 0 && time > k){
				--index_a;
				time -= a[index_a];
			}
			if(time > k)break;
			ans = Math.max(ans, index_a + i);
			if(i == m)break;
			time += b[i];
		}
		System.out.print(ans);
	}
}
