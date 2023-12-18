
import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args){
		solve();
	}
	public static void solve(){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		double[] a = new double[n];
		double[] b = new double[n];
		HashMap<Double, Integer> ans = new HashMap<Double, Integer>();
		int[] count = new int[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextDouble();
			b[i] =  a[i];
		}		
		Arrays.sort(a);
		for(int i=0;i<n-1;i++){
			if(a[i]==a[i+1]){
				count[i] = Math.max(1,count[i]);
				count[i+1] = count[i]+1;
			}
		}
		for(int i=n-1;i>=0;i--){
			if(count[i]==0){
				ans.put(a[i], 3 * i);
			}
			else{
				ans.put(a[i], 3 * (i-count[i]+1) + (count[i]-1));
				i -= count[i] - 1;
			}
		}
		for(int i=0;i<n;i++){
			System.out.println(ans.get(b[i]));
		}
	}
}

