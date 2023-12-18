import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Scanner in = new Scanner(System.in);
        int n = in.nextInt(), r[] = new int[4001], g[] = new int[4001], b[] = new int[4001], rn = 0, gn = 0, bn = 0;
        long ans = 0;
        char[] s = in.next().toCharArray();
        for (int i = 0; i < n; i++) {
            if (s[i] == 'R') {
                r[rn++] = i;
            } else if (s[i] == 'G') {
                g[gn++] = i;
            } else {
                b[bn++] = i;
            }
        }
        for (int i = 0; i < rn; i++) {
            for (int j = 0; j < gn; j++) {
                int max = Math.max(r[i], g[j]);
                int min = Math.min(r[i], g[j]);
                int x = max - min, a = bn;
                if (x + max < n && s[x + max] == 'B')
                    a--;
                if (min - x >= 0 && s[min - x] == 'B')
                    a--;
                if ((min + max) % 2 == 0 && s[(min + max) / 2] == 'B')
                    a--;
                ans += (long) a;
            }
        }
        System.out.println(ans);
    }

}
