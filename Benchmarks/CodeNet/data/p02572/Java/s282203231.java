import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
class Main {
public static void main (String[] args) throws IOException { 
	Scanner in = new Scanner(System.in);
        InputStreamReader s = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(s);
	long mod = 1000000007;
        int N = Integer.parseInt(br.readLine()); 
	long A[] = new long[N]; 
        for (int i = 0; i < N; i++) {
        A[i] = Long.parseLong(br.readLine());
    }   long a = 0 ,b;int j=0;
        long ans =0;
        
        for (int i = 0; i < N; i++) {
            for (int k = i+1; k < N; k++) {
                ans = (ans + A[i]*A[k])%mod;j++;
                if (k>=N) {
                    return;
                }
            }
                
            }
                
	System.out.print(ans); 

	} 
}