import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        long n = s.nextLong(), y = s.nextLong();
        long mx = -1;
        long a10000 = -1, a5000 = -1, a1000 = -1;
        boolean ok = true;
        for(long i = 0; i <= y / 10000 && ok; ++i) {
            for(long j = 0; j <= (y - i * 10000)/ 5000; ++j) {
                long total = i * 10000 + j * 5000;
                long k = (y - total) / 1000;
                if (i * 10000 + j * 5000 + k * 1000 == y && i + j + k == n) {
                    a10000 = i;
                    a5000 = j;
                    a1000 = k;
                    ok = false;
                    break;
                }
            }
        }
        System.out.println(a10000 + " " + a5000 + " " + a1000);
    }
}
