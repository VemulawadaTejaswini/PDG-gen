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

        int[] leftCnt = new int[n];
        int[] rightCnt = new int[n];
        int[] totalCnt = new int[n];
        for(int i = 0; i < n; i++) {
        	int cnt = 0;
        	for(int j = 0; j < i; j++) {
        		if(arr[j] < arr[i])
        			cnt++;
        	}
        	leftCnt[i] = cnt;
        	cnt = 0;
        	for(int j = i + 1; j < n; j++) {
        		if(arr[j] < arr[i])
        			cnt++;
        	}
        	rightCnt[i] = cnt;
        	totalCnt[i] = leftCnt[i] + rightCnt[i];
        }
        
        int MOD = 1000000007;
        
        long kk = k * (k - 1) / 2 % MOD; 
        
        long asn = 0;
        for(int i = 0; i < n; i++) {
        	asn += ((totalCnt[i] * kk % MOD) + (k * rightCnt[i]) % MOD) % MOD;
        }
        System.out.println(asn % MOD);
    }
}
