import java.util.*;

public class Main {


    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        long[] non = new long[n];
        long[] one = new long[n];
        long[] nine = new long[n];
        long[] both = new long[n];
        long mod = 1000000007;


        for (int i=0; i<n; i++) {

            if (i==0) {
                non[i] = 10;
                one[i] = 1;
                nine[i] = 1;
                both[i] = 0;
            } else {
                non[i] = non[i-1] * 8 % mod;
                one[i] = (non[i-1] + one[i-1] * 9) % mod;
                nine[i] = (non[i-1] + nine[i-1] * 9) % mod;
                both[i] = (one[i-1] + nine[i-1] + both[i-1] * 10) % mod;
            }
        }

        System.out.println(both[n-1]);


    }
}