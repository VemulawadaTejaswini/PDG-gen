
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNextLong()) {
            long x = sc.nextLong();
            long fiveAndSix = (x / 11) * 2;
            long rem = x % 11;
            if ( rem > 0 && rem <= 6 ) {
                fiveAndSix++;
            } else if ( rem != 0 ) {
                fiveAndSix += 2;
            }

            System.out.println(fiveAndSix);
        }
    }
}
