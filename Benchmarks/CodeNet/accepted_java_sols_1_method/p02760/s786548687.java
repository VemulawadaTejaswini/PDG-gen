import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] b = new int[9];
        for (int i = 0; i < 9; i++) {
            b[i] = sc.nextInt();
        }
        int n = sc.nextInt();
        Set<Integer> set = new HashSet<>(n);
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }
        if ((set.contains(b[0]) && set.contains(b[1]) && set.contains(b[2]))
                || (set.contains(b[3]) && set.contains(b[4]) && set.contains(b[5]))
                || (set.contains(b[6]) && set.contains(b[7]) && set.contains(b[8]))
                || (set.contains(b[0]) && set.contains(b[3]) && set.contains(b[6]))
                || (set.contains(b[1]) && set.contains(b[4]) && set.contains(b[7]))
                || (set.contains(b[2]) && set.contains(b[5]) && set.contains(b[8]))
                || (set.contains(b[0]) && set.contains(b[4]) && set.contains(b[8]))
                || (set.contains(b[2]) && set.contains(b[4]) && set.contains(b[6]))
        ) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
