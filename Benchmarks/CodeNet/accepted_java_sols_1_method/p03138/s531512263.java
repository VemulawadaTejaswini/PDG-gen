import java.util.*;
public class Main{
	public static void main(String[] args){
		long ans = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		
		long[] a = new long[n];
		long[][] a2 = new long[n][40];
		for(int i=0; i<n; i++){
			long ai = sc.nextLong();
			a[i] = ai;
			
			for(int j=0; j<40; j++){
				a2[i][j] = ai % 2;
				ai -= ai % 2;
				ai /= 2;
			}
		}
		
		long[] sums = new long[40];
		for(int i=0; i<n; i++){
			for(int j=0; j<40; j++){
				sums[j] += a2[i][j];
			}
		}
		
		int kmax = 0;
		long n2 = 1;
		while(k >= n2){
			kmax++;
			n2 *= 2;
		}
		
		long n2k = n2 / 2;
		for(int i=kmax; i<40; i++){
			ans += n2 * sums[i];
			n2 *= 2;
		}
		
		int frag = 1;
		for(int i=kmax-1; i>=0; i--){
			if(sums[i]*2 < n && frag == 1){
				ans += n2k * (n-sums[i]);
				k -= n2k;
				n2k /= 2;
				while(k < n2k){
					i--;
					ans += n2k * sums[i];
					n2k /= 2;
				}
			}
			else{
				frag = 0;
				ans += n2k * Math.max(sums[i], n-sums[i]);
				n2k /= 2;
			}
		}
		
		System.out.println(ans);
	}
}