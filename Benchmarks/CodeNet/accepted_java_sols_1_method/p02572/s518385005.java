import java.util.*;
public class Main {
	public static void main(String[] args){
      	long MOD = 1000000007;
		Scanner sc = new Scanner(System.in);
      	int n = sc.nextInt();
      	long[] a = new long[n];
      	long[] sum = new long[n];
      	long ans = 0;
      	for(int i=0;i<n;i++){
          a[i] = sc.nextLong();
        }
      	sum[n-1] = a[n-1];
      	//System.out.println(sum[n-1]+" ");
      	for(int i=n-2;i>0;i--){
          sum[i] = ( a[i]+sum[i+1] ) % MOD ;
          //System.out.println(sum[i]+" ");
        }
      	for(int i=0;i<n-1;i++){
          ans = ( ans + a[i] * sum[i+1] ) % MOD;
        }
      	System.out.println(ans);
      
	}
}