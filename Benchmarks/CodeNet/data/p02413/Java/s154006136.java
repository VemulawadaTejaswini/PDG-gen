import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        final int r;
        final int c;
        final int[][] ints;
        try (Scanner scanner = new Scanner(System.in)) {
            r = scanner.nextInt();
            c = scanner.nextInt();
            ints = new int[r + 1][c + 1];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    ints[i][j] = scanner.nextInt();
                    ints[i][c] += ints[i][j];
                    ints[r][j] += ints[i][j];
                    ints[r][c] += ints[i][j];
                }
            }
        }
        Arrays
                .stream(ints)
                .map(Main::toStringList)
                .map(it -> String.join(" ", it))
                .forEach(System.out::println);
    }

    private static List<String> toStringList(int[] intArray) {
        return Arrays.stream(intArray).mapToObj(String::valueOf).collect(Collectors.toList());
    }
}