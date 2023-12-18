import java.util.*;
import java.io.*;
 
public class Main {
    static int h,w,ch,cw,dh,dw;
    static char[][] map;
    public static void main(String[] args) throws Exception {
        FastScanner sc = new FastScanner(System.in);
        PrintWriter pw = new PrintWriter(System.out);
        h = sc.nextInt();
        w = sc.nextInt();
        ch = sc.nextInt()-1;
        cw = sc.nextInt()-1;
        dh = sc.nextInt()-1;
        dw = sc.nextInt()-1;
        map = new char[h][w];
        for(int i = 0; i < h; i++){
            map[i] = sc.next().toCharArray();
        }
        Deque<Point> q = new ArrayDeque<Point>();
        q.add(new Point(cw,ch,0));
        int[][] arrived = new int[h][w];
        for(int i = 0; i < h; i++){
            Arrays.fill(arrived[i],Integer.MAX_VALUE);
        }
        while(q.size() > 0){
            Point now = q.poll();
            int nx = now.x;
            int ny = now.y;
            int ncnt = now.cnt;
            //pw.println(nx + " " + ny + " " + ncnt);
            if(ncnt > arrived[ny][nx]) continue;
            for(int i = -2; i <= 2; i++){
                for(int j = -2; j <= 2; j++){
                    if(i == 0 && j == 0) continue;
                    int my = ny + i;
                    int mx = nx + j;
                    if(!check(my,mx)) continue;
                    if(Math.abs(i) + Math.abs(j) == 1){
                        if(arrived[my][mx] <= ncnt) continue;
                        arrived[my][mx] = ncnt;
                        q.addLast(new Point(mx,my,ncnt));
                    }else{
                        if(arrived[my][mx] <= ncnt+1) continue;
                        arrived[my][mx] = ncnt+1;
                        q.addFirst(new Point(mx,my,ncnt+1));
                    }
                }
            }
        }
        pw.println(arrived[dh][dw] == Integer.MAX_VALUE ? -1 : arrived[dh][dw]);
        pw.flush();
    }
    
    static boolean check(int y, int x){
        return (0 <= y && y < h && 0 <= x && x < w && map[y][x] == '.');
    }

    static class GeekInteger {
        public static void save_sort(int[] array) {
            shuffle(array);
            Arrays.sort(array);
        }
 
        public static int[] shuffle(int[] array) {
            int n = array.length;
            Random random = new Random();
            for (int i = 0, j; i < n; i++) {
                j = i + random.nextInt(n - i);
                int randomElement = array[j];
                array[j] = array[i];
                array[i] = randomElement;
            }
            return array;
        }
 
    }
}

class Point{
    int x,y,cnt;
    public Point(int x, int y, int cnt){
        this.x = x;
        this.y = y;
        this.cnt = cnt;
    }
}
class FastScanner {
    private BufferedReader reader = null;
    private StringTokenizer tokenizer = null;
    public FastScanner(InputStream in) {
        reader = new BufferedReader(new InputStreamReader(in));
        tokenizer = null;
    }

    public String next() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }

    public String nextLine() {
        if (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                return reader.readLine();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken("\n");
    }

    public long nextLong() {
        return Long.parseLong(next());
    }

    public int nextInt() {
        return Integer.parseInt(next());
    }

    public double nextDouble() {
         return Double.parseDouble(next());
    }
    
    public String[] nextArray(int n) {
        String[] a = new String[n];
        for (int i = 0; i < n; i++)
            a[i] = next();
        return a;
    }

    public int[] nextIntArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = nextInt();
        return a;
    }

    public long[] nextLongArray(int n) {
        long[] a = new long[n];
        for (int i = 0; i < n; i++)
            a[i] = nextLong();
        return a;
    } 
}
