import java.util.*;

public class Main {
    public static void main(String[] args) {

        solve_149_B();
      
        return;
    }

	private static void solve_149_B() {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long K = sc.nextLong();

        if (A >= K) {
            A = A - K;
        } else { // if( A<K )
            if (B >= (K - A)) {
                B = B - (K - A);
            } else {
                B = 0;
            }
            A = 0;
        }
        System.out.println(A + " " + B);
    }
}