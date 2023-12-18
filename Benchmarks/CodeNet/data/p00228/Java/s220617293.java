import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] s = { { 0, 1, 1, 1, 1, 1, 1 }, { 0, 0, 0, 0, 1, 1, 0 }, { 1, 0, 1, 1, 0, 1, 1 },
                { 1, 0, 0, 1, 1, 1, 1 }, { 1, 1, 0, 0, 1, 1, 0 }, { 1, 1, 0, 1, 1, 0, 1 },
                { 1, 1, 1, 1, 1, 0, 1 }, { 0, 1, 0, 0, 1, 1, 1 }, { 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 0, 1, 1, 1, 1 } };
        for (;;) {
            int n = sc.nextInt();
            int[] a = new int[7];
            if (n == -1) {
                break;
            }
            while (n-- > 0) {
                int m = sc.nextInt();
                for (int i = 0; i < 7; i++) {
                    System.out.print((a[i] ^ s[m][i]) + (i == 6? "\n" : ""));
                }
                a = s[m].clone();
            }
        }
    }
}
