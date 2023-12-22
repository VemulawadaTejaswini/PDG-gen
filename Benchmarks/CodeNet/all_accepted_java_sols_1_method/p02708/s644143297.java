import java.util.*;
 
public class Main {
    public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		long[] begin = new long[n+1];
		long[] end = new long[n+1];
		for(int i=1; i<n+1; i++){
			begin[i] = begin[i-1]+i;
		}
		end[0] = n;
		int count = 1;
		for(int i=n-1; count<n+1; i--){
			end[count] = end[count-1]+i;
			count++;
		}
		long total = 0;
		long mod = 1_000_000_007;
		for(int i=k-1; i<begin.length; i++){
			total = (total+end[i]-begin[i]+1)%mod;
		}
		System.out.println(total);

	}
}
