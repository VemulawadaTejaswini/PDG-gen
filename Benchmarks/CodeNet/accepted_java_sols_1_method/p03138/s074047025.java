import java.util.*;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long k = sc.nextLong();
		long[] a = new long[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextLong();
		}
		long[] kbin = new long[40];
		long[] xbin = new long[40];
		int kdigit = 0;
		long kcopy = k;
		while(kcopy>0){
			if(kcopy%2==1){
				kbin[kdigit] = 1;
			}
			kdigit++;
			kcopy /= 2;
		}
		long[] abin = new long[40];
		for(int i=0; i<n; i++){
			long acopy = a[i];
			int adigit = 0;
			while(acopy>0){
				if(acopy%2==1){
					abin[adigit]++;
				}
				adigit++;
				acopy /= 2;
			}
		}
		for(int i=0; i<40; i++){
			if(abin[i] >= n-abin[i]){
				xbin[i] = 0;
			}
			else{
				xbin[i] = 1;
			}
		}
		for(int i=39; i>=0; i--){
			if(kbin[i]==1 && xbin[i]==0)break;
			if(kbin[i]==0 && xbin[i]==1)xbin[i] = 0;
		}
		long x = 0;
		for(int i=0; i<40; i++){
			x += (long)Math.pow(2, i) * xbin[i];
		}
		long ans = 0;
		for(int i=0; i<n; i++){
			ans += x ^ a[i];
		}
		System.out.println(ans);
	}
}