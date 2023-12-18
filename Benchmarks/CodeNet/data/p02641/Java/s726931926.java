import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int X = scan.nextInt();
        int N = scan.nextInt();

        HashSet<Integer> hash = new HashSet<>();

        for (int i = 0; i < N; i++) {
            hash.add(scan.nextInt());
        }

        if (N == 0) {
            System.out.println(X);
            return;
        }

        int i;

        for (i = 1; i < N; i++) {
            if (!hash.contains(X - i)) {
                System.out.println(X - i);
                return;
            }
            else if (!hash.contains(X + i)) {
                System.out.println(X + i);
                return;
            }
        }
        System.out.println(X - i - 1);


    }
}
