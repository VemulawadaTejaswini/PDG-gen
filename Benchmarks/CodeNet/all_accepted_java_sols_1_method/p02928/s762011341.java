import java.util.*;

public class Main {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long k = sc.nextLong();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++) {
        	arr[i] = sc.nextInt();
        }

        int rightCnt = 0;
        int totalCnt = 0;
        for(int i = 0; i < n; i++) {
        	for(int j = 0; j < n; j++) {
        		if(arr[j] < arr[i]) {
        			totalCnt++;
        			if(j > i)
        				rightCnt++;
        		}
        	}
        }
        
        int MOD = 1000000007;
        
        long kk = k * (k - 1) / 2 % MOD; 
        
        long asn = ((totalCnt * kk % MOD) + (k * rightCnt % MOD)) % MOD;
        System.out.println(asn);
    }
}
