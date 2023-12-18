import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long a = scanner.nextLong();
        long r = 0;
        for (int i = 1; i <= a; i++) {
            if (i % 3 != 0 && i % 5 != 0) {
                r += i;
            }
        }
        System.out.println(r);
    }

}