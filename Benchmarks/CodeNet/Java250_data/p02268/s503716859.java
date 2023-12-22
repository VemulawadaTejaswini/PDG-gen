import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for (int i = 0; i < n; i++) {
            s[i] = in.nextInt();
        }
        int q = in.nextInt();
        int[] t = new int[q];
        for (int i = 0; i < q; i++) {
            t[i] = in.nextInt();
        }

        int c = 0;
        for (int i : t) {
            if (binarySearch(s, i)) {
                c++;
            }
        }
        System.out.println(c);
    }

    private static boolean binarySearch(int[] s, int val) {
        int left = 0;
        int right = s.length - 1;
        int mid = (right + left) / 2;

        while (left <= right) {
            if (s[mid] == val) {
                return true;
            } else if (s[mid] > val) {
                right = mid - 1;
                mid = (right + left) / 2;
            } else {
                left = mid + 1;
                mid = (right + left) / 2;
            }
        }
        return false;
    }
}

