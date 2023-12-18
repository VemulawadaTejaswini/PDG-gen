import java.util.Scanner;
class Main {
public static void main (String[] args) { 
	Scanner in = new Scanner(System.in);
	long mod = 1000000007;
        int N = in.nextInt(); 
	long A[] = new long[N]; 
        for (int i = 0; i < N; i++) {
        A[i] = in.nextInt();
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