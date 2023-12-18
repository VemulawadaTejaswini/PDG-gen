import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = Math.abs(sc.nextLong());
        long K = sc.nextLong();
        long D = sc.nextLong();
        if (X == 0) {
            System.out.println(K%2 == 0 ? 0 : D);
            return;
        }
        if (D*K <= X) {
            System.out.println(X-D*K);
            return;
        } else {
            long near = X/D;
            K -= near;
            X -= D*near;
            System.out.println(K%2 == 0 ? X : Math.abs(X-D));
        }
    }
}