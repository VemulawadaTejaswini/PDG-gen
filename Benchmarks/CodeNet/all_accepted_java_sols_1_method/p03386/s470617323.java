import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        int k = sc.nextInt();
        TreeSet<Long> set = new TreeSet<>();
        for (long i = a; i < Math.min(a + k, b); i++) {
            set.add(i);
        }
        for (long i = Math.max(a, b - k + 1); i <= b; i++) {
            set.add(i);
        }
        for (long i : set) {
            System.out.println(i);
        }
    }
}