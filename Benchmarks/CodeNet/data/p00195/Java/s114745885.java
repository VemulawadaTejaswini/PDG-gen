import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (;;) {
            int n = sc.nextInt(), m = sc.nextInt();
            if ((n | m) == 0)
                break;
            int[][] l = new int[5][2];
            l[0][0] = 0;
            l[0][1] = n + m;
            for (int i = 1; i < 5; i++) {
                l[i][0] = i;
                l[i][1] = sc.nextInt() + sc.nextInt();
            }
            Arrays.sort(l, new Comparator<int[]>() {
                public int compare(int[] a, int[] b) {
                    return b[1] - a[1];
                }
            });
            System.out.println((char)(l[0][0]+'A')+" "+l[0][1]);
        }
    }
}

