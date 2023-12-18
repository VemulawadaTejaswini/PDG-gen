import java.util.Scanner;
import java.util.TreeSet;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long k = sc.nextLong();
        TreeSet<Long> set = new TreeSet<>();
        for (long i = a; i < a + k && i <= b; i++) {
            set.add(i);
        }
        for (long i = b; i > b - k && i >= a ; i--) {
            set.add(i);
        }
        for (Long long1 : set) {
            System.out.println(long1);
        }
    }
}