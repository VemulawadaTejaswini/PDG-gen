
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringJoiner;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.joining;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        final Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));
        final int n = in.nextInt();
        final int[] a = new int[n];
        final int[] result = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = in.nextInt();
        }

        int tmp = a[0];
        for (int i = 1; i < n; ++i) {
            tmp = a[i] - tmp;
        }
        result[0] = tmp;

        for (int i = 0; i < n - 1; i++) {
            result[i + 1] = (a[i] - result[i] / 2) * 2;
        }

        System.out.println(String.join(" ", Arrays.stream(result).mapToObj(Integer::toString).collect(Collectors.toList())));
    }
}
