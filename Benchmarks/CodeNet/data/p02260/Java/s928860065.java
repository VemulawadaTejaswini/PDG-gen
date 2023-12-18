import java.util.Scanner;
import java.util.stream.Collector;
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
        int t = 0;
        for (int i = 0; i < a.length; i++) {
            int minj = i;
            for (int j = i; j < a.length; j++) {
                if (a[j] < a[minj]) {
                    minj = j;
                }
            }
            if (minj != i) {
                int tmp = a[i];
                a[i] = a[minj];
                a[minj] = tmp;
                t++;
            }
        }
        System.out.println(Stream.of(a).map(Object::toString)
                           .collect(Collectors.joining(" ")));
        System.out.println(t);
    }
}


