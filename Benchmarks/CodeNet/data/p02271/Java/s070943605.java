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

    private static boolean func(int i, List<Integer> list, int left) {
        if (i == list.size()) {
            return left == 0;
        }

        return func(i + 1, list, left - list.get(i)) || func(i + 1, list, left);
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] A = inputIntArray(n);

        int q = scanner.nextInt();
        int[] m = inputIntArray(q);

        for (int i = 0; i < q; ++i) {
            int t = m[i];

            boolean flag = func(0, asIntergerList(A), t);

            System.out.println(flag ? "yes" : "no");
        }
    }
}

