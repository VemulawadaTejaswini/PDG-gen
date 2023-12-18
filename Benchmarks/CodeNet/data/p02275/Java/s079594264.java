import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int n = Integer.parseInt(sc.nextLine());
            int[] a = Stream.of(sc.nextLine().split(" "))
                    .map(Integer::parseInt)
                    .mapToInt(i -> i)
                    .toArray();
            int max = 10_000;
            int[] b = countingSort(a, max);
            System.out.println(Arrays.stream(b)
                    .boxed()
                    .map(Object::toString)
                    .collect(Collectors.joining(" ")));
        } catch (NoSuchElementException | NumberFormatException e) {
            System.out.println(e);
            return;
        }
    }

    private static int[] countingSort(int[] a, int max) {
        int[] c = new int[max + 1];
        for (int i = 0; i <= max; i++) {
            c[i] = 0;
        }
        for (int j = 0; j < a.length; j++) {
            c[a[j]]++;
        }
        for (int i = 1; i <= max; i++) {
            c[i] = c[i] + c[i-1];
        }
        int[] b = new int[a.length];
        for (int j = a.length - 1; j >= 0; j--) {
            b[c[a[j]] - 1] = a[j];
            c[a[j]]--;
        }
        return b;
    }
}


