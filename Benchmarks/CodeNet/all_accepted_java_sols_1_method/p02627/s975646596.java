import java.util.*;
import java.util.concurrent.ConcurrentSkipListSet;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String s = scanner.next();
        char c = s.charAt(0);

        if (c >= 0x41 && c <= 0x5a) {
            System.out.println("A");
        } else if (c >= 0x61 && c <= 0x7a) {
            System.out.println("a");
        }
    }
}