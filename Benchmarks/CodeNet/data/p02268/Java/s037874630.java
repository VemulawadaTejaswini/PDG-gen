import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br.readLine());
        int[] s = createListInt(br.readLine());
        int q = ip(br.readLine());
        int[] t = createListInt(br.readLine());
        int count = 0;
        // Arrays.sort(s);
        for (int i = 0; i < q; i++) {
            if (binarySearch(s, t[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean binarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == key) {
                return true;
            } else if (key < a[mid]) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }
        return false;
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static long[] createListLong(String line) {
        String[] lines = line.split(" ");
        int n = lines.length;
        long[] list = new long[n];
        while (n-- > 0) {
            list[n] = Long.parseLong(lines[n]);
        }
        return list;
    }

    static int ip(String s) {
        return Integer.parseInt(s);
    }

    static long lp(String s) {
        return Long.parseLong(s);
    }
}