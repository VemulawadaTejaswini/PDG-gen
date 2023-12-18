import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class Main {
    static int count = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = ip(br);
        int[] list = createListInt(br);
        mergeSort(list, 0, n);
        String[] str = new String[n];
        int i = 0;
        for (int m : list) {
            str[i++] = String.valueOf(m);
        }
        System.out.println(String.join(" ", str));
        System.out.println(count);

    }

    static void merge(int[] a, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];
         System.arraycopy(a, left, l, 0, n1);

         System.arraycopy(a, mid, r, 0, n2);
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;

        for (int i = 0, j = 0, k = left; k < right; k++) {
            a[k] = l[i] <= r[j] ? l[i++] : r[j++];
            count++;
        }

    }

    static void mergeSort(int[] a, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(a, left, mid);
            mergeSort(a, mid, right);
            merge(a, left, mid, right);
        }
    }

    static boolean isNumber(String num) {
        return Pattern.compile("^\\-?[0-9]*\\.?[0-9]+$").matcher(num).find();
    }

    static int[] createListInt(BufferedReader br) throws IOException {
        String[] lines = br.readLine().split(" ");
        int n = lines.length;
        int[] list = new int[n];
        while (n-- > 0) {
            list[n] = Integer.parseInt(lines[n]);
        }
        return list;
    }

    static int ip(BufferedReader s) throws IOException {
        return Integer.parseInt(s.readLine());
    }
}