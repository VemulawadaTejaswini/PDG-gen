import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner in = new Scanner(System.in);
        long n = in.nextInt();

        Set<Long> S = new HashSet<>();
        for (int i = 0; i < n; i++) {
            long a = in.nextInt();
            if (S.contains(a)) {
                S.remove(a);
            } else {
                S.add(a);
            }
        }

        System.out.println(S.size());
    }
}
