import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long K = sc.nextLong();
        long A = sc.nextLong();
        long B = sc.nextLong();
        if (B <= A+2) {
            System.out.println(K+1);
            return;
        } else {
            long Kres = K+1-A;
            System.out.println(A+(B-A)*(Kres/2)+Kres%2);
            return;
        }
    }
}