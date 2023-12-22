
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final Set<Integer> set = new HashSet<>();
        for (int i = 0; i < n; i++) {
            final int target = in.nextInt();
            if (set.contains(target)) {
                System.out.println("NO");
                return;
            }
            set.add(target);
        }
        System.out.println("YES");
    }
}
