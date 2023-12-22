import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        StringBuilder name = new StringBuilder();
        while (n > 0) {
            long lowchar = n % 26;
            if (lowchar == 0) {
                lowchar = 26;
            }
            name.insert(0, (char) ('a' - 1 + lowchar));
            n = n - lowchar;
            n = n / 26;
        }
        System.out.println(name.toString());
    }
}