import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long[][] V = new long[n][2];
        for (int i = 0; i < n; i++) {
            V[i][0] = sc.nextLong();
            V[i][1] = sc.nextLong();
        }
        Arrays.sort(V, (x,y) -> Long.compare(x[0], y[0]));
        int uv = 0, dv = 0;
        long cx = V[0][0], cy = V[0][1];
        long umax = 0L, dmax = 0L;
        for (int i = 1; i < n; i++) {
            long tmp = Math.abs(cx - V[i][0]) + Math.abs(cy - V[i][1]);
            if(cy < V[i][1]){
                if(umax < tmp){
                    umax = tmp;
                    uv = i;
                }
            }else{
                if(dmax < tmp){
                    dmax = tmp;
                    dv = i;
                }
            }
        }
        long ux = V[uv][0], uy = V[uv][1];
        long dx = V[dv][0], dy = V[dv][1];
        long max = 0L;
        for (int i = 0; i < n; i++) {
            long utmp = Math.abs(ux - V[i][0]) + Math.abs(uy - V[i][1]);
            if(max < utmp) max = utmp;
            long dtmp = Math.abs(dx - V[i][0]) + Math.abs(dy - V[i][1]);
            if(max < dtmp) max = dtmp;
        }
        System.out.println(max);
        sc.close();

    }

}
