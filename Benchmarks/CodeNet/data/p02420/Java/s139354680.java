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

    private static int[][] deepCopy(int[][] arr) {
        int[][] res = new int[arr.length][];
        for (int i = 0; i < arr.length; ++i) {
            res[i] = arr[i].clone();
        }

        return res;
    }

    private static String asString(int[][] arr) {
        String str = new String();

        for (int i = 0; i < 2; ++i) {
            str += "" + arr[i][0] + arr[i][1] + arr[i][2] + arr[i][3];
        }

        return str;
    }

    public static void main(String[] args) {
        scanner = new Scanner(System.in);

        while (true) {
            String s = scanner.next();

            if ("-".equals(s)) {
                break;
            }

            int m = scanner.nextInt();

            for (int i = 0; i < m; ++i) {
                int h = scanner.nextInt();
                s = s.substring(h, s.length()) + s.substring(0, h);
            }
            System.out.println(s);
        }
    }
}

