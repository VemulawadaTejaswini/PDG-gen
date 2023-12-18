import java.util.*;
class Rect{
    int x1, x2, y1, y2;
}
class Line{
    int y, x1, x2;
    int ud;
}
public class Main{
    static int[] dx = {-1, 0, 1, 0};
    static int[] dy = {0, 1, 0, -1};
    public static int lower_bound(int[] array, int start_index, int end_index, int key){
        int l = start_index;
        int r = end_index-1;
        while(l<r){
            int mid = l + (r-l)/2;
            if(array[mid]>=key)
                r = mid;
            else l = mid + 1;
        }
        return l;
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()) {
            int w = sc.nextInt();
            int h = sc.nextInt();
            if (w == 0 && h == 0) return;
            int n = sc.nextInt();
            Rect[] rects = new Rect[n];
            Line[] lines = new Line[n*2];
            int[] xx = new int[2 * n + 2];
            int[] yy = new int[2 * n + 2];
            for (int i = 0; i < n; i++) {
                rects[i] = new Rect();
                rects[i].x1 = sc.nextInt();
                rects[i].y1 = sc.nextInt();
                rects[i].x2 = sc.nextInt();
                rects[i].y2 = sc.nextInt();
                xx[i << 1] = rects[i].x1;
                xx[i << 1 | 1] = rects[i].x2;
                yy[i << 1] = rects[i].y1;
                yy[i << 1 | 1] = rects[i].y2;
            }
            xx[n << 1] = 0;
            xx[n << 1 | 1] = w;
            yy[n << 1] = 0;
            yy[n << 1 | 1] = h;
            Arrays.sort(xx);
            Arrays.sort(yy);
            int cntx = unique(xx);
            int cnty = unique(yy);
            for(int i=0; i<n; i++){
                int x1, y1, x2, y2;
                x1 = lower_bound(xx, 0, cntx, rects[i].x1);
                x2 = lower_bound(xx, 0, cntx, rects[i].x2);
                y1 = lower_bound(yy, 0, cnty, rects[i].y1);
                y2 = lower_bound(yy, 0, cnty, rects[i].y2);
                lines[i<<1] = new Line();
                lines[i<<1|1] = new Line();
                lines[i<<1].y = y1;
                lines[i<<1].ud = 1;
                lines[i<<1].x1 = x1;
                lines[i<<1].x2 = x2;
                lines[i<<1|1].y = y2;
                lines[i<<1|1].ud = -1;
                lines[i<<1|1].x1 = x1;
                lines[i<<1|1].x2 = x2;
            }
            Arrays.sort(lines, new Comparator<Line>() {
                @Override
                public int compare(Line o1, Line o2) {
                    return o1.y - o2.y;
                }
            });
            int[][] mat = new int[2*n+10][2*n+10];
            for(int i=0; i<2*n; i++){
                int y = lines[i].y;
                for(int j=lines[i].x1; j<lines[i].x2; j++){
                    mat[y][j] += lines[i].ud;
                }
            }
            for(int i=1; i<cnty-1; i++)
                for(int j=0; j<cntx-1; j++)
                    mat[i][j] += mat[i-1][j];
            int ans = 0;
            boolean[][] vis = new boolean[2*n+10][2*n+10];
            int cnt = 2*n+2;
            Queue<Integer> q = new LinkedList<>();
            for(int i=0; i<cnty-1; i++){
                for(int j=0; j<cntx-1; j++){
                    if(mat[i][j]!=0||vis[i][j]) continue;
                    ++ans;
                    q.offer(i*cnt+j);
                    while(!q.isEmpty()){
                        int x = q.peek()/cnt;
                        int y = q.peek()%cnt;
                        q.poll();
                        int nx, ny;
                        for(int k=0; k<4; k++){
                            nx = x + dx[k];
                            ny = y+dy[k];
                            if(nx>=0&&nx<cnty-1&&ny>=0&&ny<cntx-1&&!vis[nx][ny]&&mat[nx][ny]==0){
                                vis[nx][ny] = true;
                                q.offer(nx*cnt+ny);
                            }
                        }
                    }
                }
            }
            System.out.println(ans);
        }
    }
    public static int unique(int[] xx){
        int cur_pos = 1;
        for(int i=1; i<xx.length; i++){
            if(xx[i]==xx[i-1]) continue;
            xx[cur_pos++] = xx[i];
        }
        return cur_pos;
    }
}
