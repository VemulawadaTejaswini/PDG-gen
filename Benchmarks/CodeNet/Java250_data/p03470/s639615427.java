import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Stream;

public class Main
{
    private static int f(int[] xs, int pos, int max, int count) {
        if (pos >= xs.length) {
            return count;
        }

        if (xs[pos] < max) {
            return Math.max(
                    f(xs, pos + 1, xs[pos], count + 1),
                    f(xs, pos + 1, max, count));
        }
        else {
            return f(xs, pos + 1, max, count);
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] xs = new int[n];
        for (int i = 0; i < n; i++) {
            xs[i] = sc.nextInt();
        }

//        System.out.println(f(xs, 0, Integer.MAX_VALUE, 0));
        Set<Integer> set = new HashSet<>();
        for (int i : xs) {
            set.add(i);
        }
        System.out.println(set.size());
   }
}
