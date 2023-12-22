import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String args[]) {
        try (Scanner in = new Scanner(System.in)) {
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            Set<Integer> set = new HashSet<Integer>();
            set.add(a);
            set.add(b);
            set.add(c);
            System.out.println(set.size());
        }
    }
}
