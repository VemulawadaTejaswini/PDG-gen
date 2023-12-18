import java.util.*;

public class Main {
    private static Scanner scanner;

    public static int[] inputIntArray(int n) {
        int[] res = new int[n];
        for (int i = 0; i < n; ++i) {
            res[i] = scanner.nextInt();
        }

        return res;
    }

    // public static String[] <T> ToStringArray(T[] arr) {
    // String[] res = new String[arr.length];
    // for(int i = 0; i < arr.length; ++i) {
    // res[i] = String.valueOf(arr[i]);
    // }

    // return res;
    // }

    private static List<Integer> asIntergerList(int[] arr) {
        List<Integer> intList = new ArrayList<Integer>();
        for (int i = 0; i < arr.length; i++) {
            intList.add(arr[i]);
        }

        return intList;
    }

    public static int func(int depth, int from, int left) {
        if (depth == 0) {
            if (left == 0) {
                return 1;
            }

            return 0;
        }

        int res = 0;
        for (int v = from; v <= 9; ++v) {
            res += func(depth - 1, v + 1, left - v);
        }

        return res;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            int n = scanner.nextInt();
            int s = scanner.nextInt();

            if (n == 0) {
                return;
            }

            System.out.println(func(n, 0, s));
        }

    }
}

