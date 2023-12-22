import java.util.Scanner;

class Main {
    static void quickSort(int[] a, int left, int right) {
        int pl = left;
        int pr = right;
        int x = a[(pl + pr) / 2];

        do {
            while (a[pl] < x) pl++;
            while (a[pr] > x) pr--;
            if (pl <= pr) {
                int t = a[pl];
                a[pl] = a[pr];
                a[pr] = t;
                pl++;
                pr--;
            }
        } while (pl <= pr);

        if (left < pr)  quickSort(a, left, pr);
        if (pl < right) quickSort(a, pl, right);
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n = Integer.parseInt(stdIn.next());
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = Integer.parseInt(stdIn.next());
        }

        quickSort(a, 0, n - 1);

        int i;
        for (i = 0; i < n - 1; i++) {
            if (a[i] == a[i + 1]) {
                System.out.println("NO");
                break;
            }
        }

        if (i == n - 1) {
            System.out.println("YES");
        }
    }
}