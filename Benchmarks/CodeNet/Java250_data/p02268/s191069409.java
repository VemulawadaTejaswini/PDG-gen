import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = scanner.nextInt();
        }
        int q = scanner.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = scanner.nextInt();
        }
        int count = 0;
        for (int i = 0; i < q; i++) {
            if (BinarySearch(s, t[i])) {
                count++;
            }
        }
        System.out.println(count);
    }

    static boolean BinarySearch(int[] a, int key) {
        int left = 0;
        int right = a.length;
        while (left < right) {
            int mid = (left + right) / 2;
            if (a[mid] == key) {
                return true;
            }
            else if (key < a[mid]) {
                right = mid;
            }
            else {
                left = mid + 1;
            }
        } 
        return false;
    }
}

