import java.util.Scanner;
import java.lang.Math;

class Main {
    
    public static void main(String[] areg) {
        Scanner sc = new Scanner(System.in);
		int N = sc.	nextInt();
		int K = sc.	nextInt();
		sc.close();
        
        long ans = 1;
        for (int i = 0; i < N; i++)
            ans = Math.min(ans * 2, ans + K);
        
        System.out.println(ans);
    }
}