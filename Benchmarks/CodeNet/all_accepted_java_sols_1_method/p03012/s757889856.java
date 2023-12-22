import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] w = new int[N];

        for (int i=0; i<N; i++) {
            w[i] = sc.nextInt();
        }

        int l = 0;
        int r = 0;
        int lsum = 0;
        int rsum = 0;

        for (int i=0; i<N; i++) {
            if (lsum >= rsum) {
                rsum += w[N-1-r];
                r++;
                continue;
            }
            if (rsum > lsum) {
                lsum += w[l];
                l++;
                continue;
            }
        }
        System.out.println(Math.abs(rsum - lsum));
    }
}

