import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (true) {
            int n = sc.nextInt();
            int r = sc.nextInt();
            if (n == 0 && r == 0) break;
            int[] huda = new int[n];

            for (int i = 0; i < n; i++)
                huda[i] = n - i;
            for (int j = 0; j < r; j++) {
                int p = sc.nextInt();
                int c = sc.nextInt();
                int[] temp = new int[p-1];
                for (int k = 0; k < p - 1; k++)
                    temp[k] = huda[k] + 0;
                for (int l = 0; l < c; l++)
                    huda[l] = huda[l + p - 1] + 0;
                for (int m = 0; m < p -1; m++)
                    huda[m + c] = temp[m];
            }
            System.out.println(huda[0]);
        }
    }
}
