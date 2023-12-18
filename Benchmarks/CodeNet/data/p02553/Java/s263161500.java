import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        List<Long> list = Arrays.asList((Long)a * c, (Long)a * d, (Long)b * c, (Long)b * d);
        System.out.println(list.stream().max(Long::compareTo).get());
    }
}
