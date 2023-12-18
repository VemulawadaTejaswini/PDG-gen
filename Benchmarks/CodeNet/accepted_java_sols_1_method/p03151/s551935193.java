import java.util.*;

class Main
{
    public static void main(String[] args)
    {
        Scanner cin = new Scanner(System.in);
        int n = cin.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) a[i] = cin.nextInt();
        int[] b = new int[n];
        for (int i = 0; i < n; i++) b[i] = cin.nextInt();
        int[] c = new int[n];
        for (int i = 0; i < n; i++) c[i] = a[i] - b[i];

        Arrays.sort(c);

        int i = 0, mi = 0;
        int j = n - 1, mj = n - 1;

        while (c[i] < 0 && i < j) {
            int m = Math.min(-c[i], c[j]);
            c[i] += m;
            mi = i + 1;
            if (c[i] == 0) ++i;
            c[j] -= m;
            mj = j - 1;
            if (c[j] == 0) --j;
        }

        if (c[i] >= 0) {
            System.out.println(n - (mj - mi + 1));
        } else {
            System.out.println(-1);
        }
    }
}
