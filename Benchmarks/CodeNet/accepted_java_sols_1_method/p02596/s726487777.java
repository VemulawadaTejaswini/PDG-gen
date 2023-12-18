import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int k = scanner.nextInt();
        int v = 7, r = v % k;
        Set<Integer> set = new HashSet<>();
        int ptr = 1;
        while (true) {
            if (r == 0) {
                System.out.println(ptr);
                return;
            } else {
                r = (r * 10 + 7) % k;
                if (set.contains(r)) {
                    System.out.println(-1);
                    return;
                } else {
                    set.add(r);
                }
                ptr++;
            }
        }
    }
}