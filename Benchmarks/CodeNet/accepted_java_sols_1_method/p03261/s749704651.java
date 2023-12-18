import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] W = new String[N];
        boolean ok = true;
        Set<String> set = new HashSet<>();
        for (int i = 0; i < W.length; i++) {
            W[i] = sc.next();
            if (set.contains(W[i])) {
                ok = false;
            }
            set.add(W[i]);
            if (i >= 1) {
                if (W[i].charAt(0) != W[i - 1].charAt(W[i - 1].length() - 1)) {
                    ok = false;
                }
            }
        }
        if (ok) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
        sc.close();
    }
}