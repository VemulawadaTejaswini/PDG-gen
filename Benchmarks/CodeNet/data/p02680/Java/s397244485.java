import java.util.*;

public class Main {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int[] b = new int[n];
        int[] c = new int[n];
        int[] d = new int[m];
        int[] e = new int[m];
        int[] f = new int[m];
        Set<Integer> xs = new HashSet<>();
        Set<Integer> ys = new HashSet<>();
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
            b[i] = sc.nextInt();
            c[i] = sc.nextInt();
            xs.add(a[i]);
            xs.add(b[i]);
            ys.add(c[i]);
        }
        for(int i=0; i<m; i++) {
            d[i] = sc.nextInt();
            e[i] = sc.nextInt();
            f[i] = sc.nextInt();
            xs.add(d[i]);
            ys.add(e[i]);
            ys.add(f[i]);
        }
        int xn = xs.size();
        int[] xl = new int[xs.size()];
        int ii=0;
        for(int num : xs) {
            xl[ii++] = num;
        }
        Arrays.sort(xl);
        int[] yl = new int[ys.size()];
        int yn = ys.size();
        ii=0;
        for(int num : ys) {
            yl[ii++] = num;
        }
        Arrays.sort(yl);
        Map<Integer, Integer> mapx = new HashMap<>();
        Map<Integer, Integer> mapy = new HashMap<>();

        int zx = xn;
        int zy = yn;
        int[] dx = new int[xn];
        int[] dy = new int[yn];
        for(int i=0; i<xn; i++) {
            if(i>0) {
                dx[i] = xl[i]-xl[i-1];
            }
            mapx.put(xl[i], i);
            if(zx == xn && xl[i]>0) {
                zx = i;
            }
        }
        for(int i=0; i<yn; i++) {
            if(i>0) {
                dy[i] = yl[i]-yl[i-1];
            }
            mapy.put(yl[i], i);
            if(zy == yn && yl[i]>0) {
                zy = i;
            }
        }

        if(zx == xn || zy == yn || zx == 0 || zy == 0) {
            System.out.println("INF");
            return;
        }

        boolean[][] yw = new boolean[xn][yn];
        boolean[][] xw = new boolean[xn][yn];

        for(int i=0; i<n; i++) {
            int x1 = mapx.get(a[i]);
            int x2 = mapx.get(b[i]);
            int y1 = mapy.get(c[i]);
            for(int j=x1+1; j<=x2; j++) {
                yw[j][y1] = true;
            }
        }
        for(int i=0; i<m; i++) {
            int x1 = mapx.get(d[i]);
            int y1 = mapy.get(e[i]);
            int y2 = mapy.get(f[i]);
            for(int j=y1+1; j<=y2; j++) {
                xw[x1][j] = true;
            }
        }

        Queue<P> q = new LinkedList<>();
        q.add(new P(zx, zy));
        boolean[][] v = new boolean[xn][yn];
        v[zx][zy] = true;
        long res = dx[zx] * dy[zy];
        while(!q.isEmpty()) {
            P p = q.poll();

            int nx;
            int ny;
            if (!xw[p.x - 1][p.y]) {
                nx = p.x - 1;
                ny = p.y;
                if (nx == 0) {
                    System.out.println("INF");
                    return;
                }
                if(!v[nx][ny]) {
                    q.add(new P(nx, ny));
                    res += dx[nx] * dy[ny];
                    v[nx][ny] = true;
                }
            }
            if (!xw[p.x][p.y]) {
                nx = p.x + 1;
                ny = p.y;
                if (nx == xn) {
                    System.out.println("INF");
                    return;
                }
                if(!v[nx][ny]) {
                    q.add(new P(nx, ny));
                    res += dx[nx] * dy[ny];
                    v[nx][ny] = true;
                }
            }
            if (!yw[p.x][p.y-1]) {
                nx = p.x;
                ny = p.y - 1;
                if (ny == 0) {
                    System.out.println("INF");
                    return;
                }
                if(!v[nx][ny]) {
                    q.add(new P(nx, ny));
                    res += dx[nx] * dy[ny];
                    v[nx][ny] = true;
                }
            }
            if (!yw[p.x][p.y]) {
                nx = p.x;
                ny = p.y + 1;
                if (ny == yn) {
                    System.out.println("INF");
                    return;
                }
                if(!v[nx][ny]) {
                    q.add(new P(nx, ny));
                    res += dx[nx] * dy[ny];
                    v[nx][ny] = true;
                }
            }


        }
        System.out.println(res);
    }


        static class P {
            public int x;
            public int y;
            P(int x, int y) {
                this.x = x;
                this.y = y;
            }
        }


    }
