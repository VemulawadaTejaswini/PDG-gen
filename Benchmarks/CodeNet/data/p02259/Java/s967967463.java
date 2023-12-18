import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());

        int[] a = scanIntArray(scanner);

        int swapCount = 0;
        for (int i = 0; i < a.length; i++) {
            for (int j = n -1; j > i; j--) {
                if (a[j-1] > a[j]) {
                    swap(a, j-1, j);
                    swapCount++;
                }
            }
        }

        printIntArray(a, " ");
        System.out.println(swapCount);

    }

    private static int min(int x, int y) {
        return x < y ? x : y;
    }

    private static int max(int x, int y) {
        return x < y ? y : x;
    }

    private static void printIntArray(int[] array, String delimeter) {
        System.out.println(Arrays.stream(array)
                .mapToObj(String::valueOf)
                .collect(Collectors.joining(delimeter)));
    }

    private static int[] scanIntArray(Scanner scanner) {
        return Arrays.stream(scanner.nextLine().split(" ", 0))
                .mapToInt(Integer::parseInt)
                .toArray();
    }

    private static void swap(int[] a, int x, int y) {
        int tmp = a[x];
        a[x] = a[y];
        a[y] = tmp;
    }
}

