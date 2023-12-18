import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long A = sc.nextLong();
        long B = sc.nextLong();
        long C = sc.nextLong();
        long K = sc.nextLong();
        sc.close();

        long aCount = 0;
        long bCount = 0;
        long cCount = 0;

        if (K <= A) {
            aCount = K;
        } else {
            aCount = A;
            K -= A;
            if (K <= B) {
                bCount = K;
            } else {
                bCount = B;
                K -= B;
                cCount = K;
            }
        }

        System.out.println(1 * aCount + (-1) * cCount);
    }

}
