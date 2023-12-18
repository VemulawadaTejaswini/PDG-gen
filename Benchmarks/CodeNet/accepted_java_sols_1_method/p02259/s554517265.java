import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine());
        Integer[] a = new Integer[n];
        Stream.of(sc.nextLine().split(" "))
              .map(Integer::parseInt)
              .collect(Collectors.toList())
              .toArray(a);
        boolean f = true;
        int times = 0;
        while (f) {
            f = false;
            for (int i = a.length - 1; i > 0; i--) {
                if (a[i] < a[i-1]) {
                    int tmp = a[i];
                    a[i] = a[i - 1];
                    a[i - 1] = tmp;
                    f = true;
                    times++;
                }
            }
        }
        System.out.println(Stream.of(a)
                                 .map(Object::toString)
                                 .collect(Collectors.joining(" ")));
        System.out.println(times);
    }
}

