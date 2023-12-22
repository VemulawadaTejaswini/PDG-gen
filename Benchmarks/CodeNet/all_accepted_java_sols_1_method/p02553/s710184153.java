import java.util.*;
import java.util.stream.LongStream;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();

        long max = LongStream.of(a * c,a * d,b * c, b * d)
                .max().orElse(0);

        System.out.println(max);
    }
}
