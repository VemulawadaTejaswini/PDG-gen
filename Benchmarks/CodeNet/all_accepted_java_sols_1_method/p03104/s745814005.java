import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        long a = Long.parseLong(scanner.next());
        long b = Long.parseLong(scanner.next());
        scanner.close();
        long count = 0;
        long sum = (b - a + 1) / 2;

        if((b - a + 1) % 2 != 0) sum += a % 2;
        if(sum % 2 != 0) count += 1;
        for (long i = 2; i < b*2; i *= 2) {
            long c = 0;
            long r1 = a % (i * 2);
            if(r1 >= i) c += (i*2) - r1;
            long r2 = b % (i * 2);
            if(r2 >= i) c += r2 - (i * 2 - 1);
            if(c % 2 != 0){
                count += i;
            }
        }
        System.out.println(count);
    }
}
