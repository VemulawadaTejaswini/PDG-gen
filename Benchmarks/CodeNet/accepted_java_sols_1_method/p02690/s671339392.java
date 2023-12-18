
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int x = Integer.parseInt(scan.next());
        scan.close();

        int a = 0;
        int b = 0;

        for (long i = -1000; i <= 1000; i++) {
            for (long j = -1000; j <= 1000; j++) {
                long a5 = i * i * i * i * i;
                long b5 = j * j * j * j * j;
                if (a5 - b5 == x) {
                    a = (int)i;
                    b = (int)j;
                    break;
                }
            }
        }

        System.out.println(a + " " + b);
    }
}
