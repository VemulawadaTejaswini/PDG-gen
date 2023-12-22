import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            Set<Integer> remindSet = new HashSet<>();

            boolean yes = false;
            int x = A;

            while (true) {
                int rem = x % B;
                if (rem == C) {
                    yes = true;
                    break;
                }
                if (remindSet.contains(rem)) {
                    break;
                }
                remindSet.add(rem);
                x += A;
            }

            if (yes) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
