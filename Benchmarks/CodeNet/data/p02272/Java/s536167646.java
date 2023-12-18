import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) s[i] = scanner.nextInt();

        int count = mergeSort(s, n, 0, n);

        System.out.println(Arrays.toString(s).replaceAll("[\\[\\],]", ""));
        System.out.println(count);
    }

    private static int mergeSort(int[] s, int n, int left, int right) {
        if (left + 1 >= right) return 0;
        int count = 0;
        int mid = (left + right) / 2;
        count += mergeSort(s, n, left, mid);
        count += mergeSort(s, n, mid, right);
        count += merge(s, n, left, mid, right);
        return count;
    }

    private static int merge(int[] s, int n, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] l = new int[n1 + 1];
        int[] r = new int[n2 + 1];
        for (int i = 0; i < n1; i++) l[i] = s[left + i];
        for (int i = 0; i < n2; i++) r[i] = s[mid + i];
        l[n1] = Integer.MAX_VALUE;
        r[n2] = Integer.MAX_VALUE;
        int i = 0;
        int j = 0;
        int count = 0;
        for (int k = left; k < right; k++) {
            count++;
            if (l[i] <= r[j]) {
                s[k] = l[i++];
            } else {
                s[k] = r[j++];
            }
        }
        return count;
    }
}

