import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long[] A = new long[n];
        for(int i = 0; i<n; i++){
            A[i] = sc.nextLong();
        }

        long[] ruisekiwa = new long[n+1];
        ruisekiwa[0] = 0;

        for(int i = 0; i<n; i++){
            ruisekiwa[i+1] = ruisekiwa[i] + A[i];
        }

        long ans = 0L;
        for(int i = 0; i<n-1; i++){
            ans += A[i] * ((ruisekiwa[n] - ruisekiwa[i+1]) % (1000000000 + 7));
        }

        System.out.println(ans  % (1000000000 + 7));
    }
}