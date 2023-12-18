import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int c = sc.nextInt();
        int n = sc.nextInt();
        int n2 = n / 2;

        int[][] arrays = new int[n2][n2];

        for (int i = 0; i < n; i++) {
            char[] chars = sc.next().toCharArray();
            for (int j = 0; j < n; j++) {
                if (chars[j] == '0') continue;
                int x = get_x(i, n2);
                int y = get_y(j, n2);
                arrays[x][y] ^= get_bits(get_area(i, j, n2));
            }
        }
        int diffs = count_diff(arrays);
        //System.err.println(diffs);
        //printarr(arrays);
        int ans = (diffs == 0 ? 1 : 0);
        for (int i = 0; i < c - 1; i++) {
            int d = sc.nextInt();
            for (int j = 0; j < d; j++) {
                int ri = sc.nextInt() - 1, ci = sc.nextInt() - 1;
                int diff = add(ri, ci, n2, arrays);
                diffs += diff;
            }
            /**
             * check symmetric
             */
            if (diffs == 0) ans++;
        }
        System.out.println(ans);
    }

    private static void printarr(int[][] arrays) {
        for(int[] array: arrays) {
            System.err.println(Arrays.toString(array));
        }
    }

    private static int count_diff(int[][] arrays) {
        int ret = 0;
        for (int[] array : arrays) {
            for (int num : array) {
                if (num == 0 || num == 15) {
                } else {
                    ret++;
                }
            }
        }
        return ret;
    }

    static int add(int r, int c, int n2, int[][] arrays) {
        int x = get_x(r, n2);
        int y = get_y(c, n2);
        int address = x * n2 + y;
        int area = get_area(r, c, n2);
        int pre = arrays[x][y];
        int now = arrays[x][y] ^= get_bits(area);
        if (pre == 0 || pre == 15) {
            return 1;
        } else {
            if (now == 0 || now == 15) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    static int get_area(int r, int c, int n2) {
        if (r < n2 && c < n2) {//左上
            return 0;
        } else if (r >= n2 && c < n2) {//右上
            return 1;
        } else if (r < n2 && c >= n2) {//左下
            return 2;
        } else {//右下
            return 3;
        }
    }

    static int get_bits(int area) {
        return (1 << area);
    }

    static int get_x(int r, int n2) {
        if (r >= n2) {
            return r - n2;
        } else {
            return n2 - r - 1;
        }
    }

    static int get_y(int c, int n2) {
        if (c >= n2) {
            return c - n2;
        } else {
            return n2 - c - 1;
        }
    }
}

