import java.util.*;
class Main
{
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long c = sc.nextLong();
        long[] x = new long[n+2];
        long[] v = new long[n+2];
        long[] vx = new long[n+2];
        long[] vy = new long[n+2];
        long[] ax = new long[n+2];
        long[] bx = new long[n+2];
        long[] al = new long[n+2];
        long[] bl = new long[n+2];
        x[0] = v[0] = v[n+1] = vx[0] = vy[0] = ax[0] = bx[0] = al[0] = bl[0]= 0;
        x[n+1] = c;
        for(int i = 1; i < n+1; i++){
            x[i] = sc.nextLong();
            v[i] = sc.nextLong();
        }
        for(int i = 1; i < n+2; i++){
            vx[i] = vx[i-1] + v[i];
            ax[i] = Math.max(ax[i-1], vx[i] - x[i]);
            al[i] = ax[i] == ax[i-1] ? al[i-1] : x[i];
            vy[i] =  vy[i-1] + v[n + 1 - i];
            bx[i] = Math.max(bx[i-1], vy[i] - (c - x[n + 1 - i]));
            bl[i] = bx[i] == bx[i-1] ? bl[i-1] : c - x[n + 1 - i];
        }
        long ans = 0;
        for(int i = 0; i < n+1; i++){
            ans = Math.max(ans, Math.max(ax[i] + bx[n - i] - al[i], ax[i] + bx[n - i] - bl[n - i]));
        }
        System.out.println(ans);
    }
}