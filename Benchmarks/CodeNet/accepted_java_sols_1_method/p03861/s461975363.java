import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        long a = scan.nextLong(), b = scan.nextLong(), x = scan.nextLong();

        int f = 0;
        if (a%x == 0) {
            f = 1;
        }

        System.out.println(b/x - a/x + f);
    }
}
