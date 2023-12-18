import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) {
            S[i] = scanner.nextInt();
        }
        int cnt = sort(S);
        for (int i = 0; i < n; i++) {
            System.out.print(S[i]);
            if (i < n - 1) {
                System.out.print(" ");
            } else {
                System.out.println("");
            }
        }
        System.out.println(cnt);
    }

    private static int merge(int[] a1, int[] a2, int[] a) {
        int cnt = 0;
        int i1 = 0;
        int i2 = 0;
        while (i1 < a1.length || i2 < a2.length) {
            cnt++;
            if (i1 < a1.length && (i2 >= a2.length || a1[i1] < a2[i2])) {
                a[i1 + i2] = a1[i1++];
            } else {
                a[i1 + i2] = a2[i2++];
            }
        }
        return cnt;
    }

    private static int sort(int[] a) {
        if (a.length < 2) {
            return 0;
        }
        int n1 = a.length / 2;
        int n2 = a.length - n1;
        int[] a1 = new int[n1];
        int[] a2 = new int[n2];
        for (int i = 0; i < n1; i++) {
            a1[i] = a[i];
        }
        for (int i = 0; i < n2; i++) {
            a2[i] = a[n1 + i];
        }
        int cnt = 0;
        cnt += sort(a1);
        cnt += sort(a2);
        return cnt + merge(a1, a2, a);
    }
}