
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        int n = Integer.parseInt(scan.next());

        if (n == 0) {
            System.out.println(x);
            scan.close();
            return;
        }

        Set<Integer> set = new HashSet<Integer>();
        for (int i = 0; i < n; i++) {
            set.add(Integer.parseInt(scan.next()));
        }
        scan.close();

        int a = x;
        int b = x;
        while (true) {
            if (!set.contains(b)) {
                System.out.println(b);
                return;
            }
            if (!set.contains(a)) {
                System.out.println(a);
                return;
            }
            a++;
            b--;
        }

    }
}
