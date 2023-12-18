import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int min = Integer.MAX_VALUE;
        int[][] p = new int[n][2];
        for (int i = 0; i < n; i++) {
            p[i][0] = sc.nextInt();
            p[i][1] = sc.nextInt();
        }

        for (int i = 0; i < 2; i++) {
            sort(p,i);
            for (int j = 1; j < n; j++) {
                min = Math.min(min, (p[j][0] - p[j - 1][0]) * (p[j][0] - p[j - 1][0]) + (p[j][1] - p[j - 1][1]) * (p[j][1] - p[j - 1][1]));
            }
        }
        System.out.println(min);
    }

    static void sort(int[][] p, int n) {
        if (n == 0) {
            Arrays.sort(p, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return a[0] - b[0];
                }
            });
        } else {
            Arrays.sort(p, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return a[1] - b[1];
                }
            });
        }
    }
}
