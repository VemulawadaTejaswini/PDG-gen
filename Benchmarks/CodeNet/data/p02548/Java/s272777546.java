import java.math.*;
import java.util.*;
import java.io.*;
  
public class Main { 
  
    static BufferedReader in;
    static PrintWriter out = new PrintWriter(System.out);
    static String file = "../in";
    static int test = 10; // 0 for local testing, 1 for std input
    static int inf = 1 << 30, mod = 1_000_000_007;



    void swap(int[]ary, int i, int j)
    {
        int t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }

    void swap(char[]ary, int i, int j)
    {
        char t = ary[i];
        ary[i] = ary[j];
        ary[j] = t;
    }
    
    String[] split() throws Exception
    {
        return in.readLine().split(" ");
    }

    int readInt() throws Exception
    {
        return Integer.valueOf(in.readLine());
    }

    long readLong() throws Exception
    {
        return Long.valueOf(in.readLine());
    }

    long[] toLongArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        long[] ary = new long[n];
        for(int i = 0; i < n; i++) ary[i] = Long.valueOf(sp[i]);
        return ary;
    }

    int[] toIntArray() throws Exception
    {
        String[] sp = split();
        int n = sp.length;
        int[] ary = new int[n];
        for(int i = 0; i < n; i++) ary[i] = Integer.valueOf(sp[i]);
        return ary;
    }

    String reverse(String str)
    {
        return new StringBuilder(str).reverse().toString();
    }


    long pow(long a, int pow)
    {
        long res = 1;
        while(pow > 0)
        {
            if(pow % 2 != 0) {
                res *= a;
                res %= mod;
            }
            a = a * a;
            a %= mod;
            pow /= 2;
        }

        return res;
    }

    public static void main(String[] args) throws Exception
    {
        int _k = Integer.valueOf("1");
        if(test > 0) in = new BufferedReader(new InputStreamReader(System.in));
        else in = new BufferedReader(new FileReader(file));
        if(test < 0) {String[] str = in.readLine().split(" ");
        char[] gg = in.readLine().toCharArray();}
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/
/***********************************************************************/



        
        new Main().c();
        out.flush();
    }
    void f() throws Exception
    {
      

    }

    void e() throws Exception
    {
        int[] ary = toIntArray();
        int h = ary[0], w = ary[1], m = ary[2];
        int[][] bomb = new int[m][];
        for(int i = 0; i < m; i++)
        {
            bomb[i] = toIntArray();
        }

        int ans1 = rowThenCol(bomb);
        int ans2 = colThenRow(bomb);
        out.println(Math.max(ans1, ans2));
    }

    int colThenRow(int[][] bomb)
    {
        Map<Integer, Integer> row = new HashMap<>(),
            col = new HashMap<>();
        for(int[] b : bomb)
        {
            int r = b[0], c = b[1];
            col.put(c, col.getOrDefault(c, 0) + 1);
        }
        
        int pickCol = maxKey(col);
        for(int[] b : bomb)
        {
            int r = b[0], c = b[1];
            if(pickCol == c) continue;
            row.put(r, row.getOrDefault(r, 0) + 1);
        }
        int pickRow = maxKey(row);
        return row.get(pickRow) + col.get(pickCol);
    }

    int rowThenCol(int[][] bomb)
    {
        Map<Integer, Integer> row = new HashMap<>(),
            col = new HashMap<>();
        for(int[] b : bomb)
        {
            int r = b[0], c = b[1];
            row.put(r, row.getOrDefault(r, 0) + 1);
        }
        
        int pickRow = maxKey(row);
        for(int[] b : bomb)
        {
            int r = b[0], c = b[1];
            if(pickRow == r) continue;
            col.put(c, col.getOrDefault(c, 0) + 1);
        }
        int pickCol = maxKey(col);
        return row.get(pickRow) + col.get(pickCol);
    }

    int maxKey(Map<Integer, Integer> map)
    {
        int ans = 0, freq = 0;
        for(int key : map.keySet())
        {
            if(freq < map.get(key))
            {
                ans = key;
                freq = map.get(key);
            }
        }
        return ans;
    }

    int numCut(int[] ary, int thres)
    {
        int count = 0;
        for(int v : ary)
        {
            if(v > thres)
            count += v / thres;
            // count += v % thres > 0 ? 1 : 0;
        }
        return count;
    }

    void d() throws Exception
    {
        int[] ary = toIntArray();
        int h = ary[0], w = ary[1];
        ary = toIntArray();
        int ch = ary[0] - 1, cw = ary[1] - 1;
        ary = toIntArray();
        int dh = ary[0] - 1, dw = ary[1] - 1;
        char[][] grid = new char[h][w];
        for(int i = 0; i < h; i++)
        {
            grid[i] = in.readLine().toCharArray();
        }

        int[][] dp = new int[h][w];
        int inf = 1 << 30;
        for(int[] row : dp) Arrays.fill(row, inf);
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{ch, cw, 0});
        int[] dx = {1, 0, -1, 0}, dy = {0, 1, 0, -1};
        dp[ch][cw] = 0;
        while(!q.isEmpty())
        {
            Queue<int[]> q2 = new LinkedList<>();
            while(!q.isEmpty())
            {
                int[] cur = q.poll();
                q2.offer(cur);
                // System.out.println(Arrays.toString(cur));
                int x = cur[0], y = cur[1], step = cur[2];
                for(int k = 0; k < 4; k++)
                {
                    int nx = x + dx[k], ny = y + dy[k];
                    if(nx < 0 || ny < 0 || nx >= h || ny >= w || grid[nx][ny] == '#') continue;
                    if(dp[nx][ny] <= step) continue;
                    dp[nx][ny] = step;
                    q.offer(new int[]{nx, ny, step});
                }
            }
            // System.out.println("....");
            while(!q2.isEmpty())
            {
                int[] cur = q2.poll();
                // System.out.println(Arrays.toString(cur));
                int x = cur[0], y = cur[1], step = cur[2];
                
                for(int xx = -2; xx <= 2; xx++)
                {
                    for(int yy = -2; yy <= 2; yy++)
                    {
                        int nx = x + xx, ny = y + yy;
                        if(nx < 0 || ny < 0 || nx >= h || ny >= w || grid[nx][ny] == '#') continue;
                        if(dp[nx][ny] <= step + 1) continue;
                        // System.out.printf("%d %d %d %d\n", nx, ny, dp[nx][ny], step + 1);
                        dp[nx][ny] = step + 1;
                        q.offer(new int[]{nx, ny, step + 1});
                    }
                }
            }
            
        }
        // for(int[] row : dp) System.out.println(Arrays.toString(row));
        if(dp[dh][dw] >= inf) out.println(-1);
        else out.println(dp[dh][dw]);
    }



    void c() throws Exception
    {
        int n = readInt();
        int sqrt = (int) Math.sqrt(n);
        int re = 0;
        for(int a = 1; a <= n; a++)
        {
            // number of b = [1, n / a]
            int upper = n / a;
            if(a * upper == n) upper--;
            re += upper;
        }
        out.println(re);
        
    }

    void b() throws Exception
    {
        int n = readInt();
        int[][] d = new int[n][];
        boolean f0 = false, f1 = false, f2 = false;
        boolean flag = false;
        for(int i = 0; i < n; i++)
        {
            d[i] = toIntArray();
            f0 = f1;
            f1 = f2;
            if(d[i][0] == d[i][1]) f2 = true;
            else f2 = false;
            if(f0 && f1 && f2) flag = true;
        }
        if(flag) out.println("Yes");
        else out.println("No");
    }

    boolean transform(String s1, String s2)
    {
        // from s1 -> s2
        int m = s1.length(), n = s2.length();
        if(m < n) return false;
        int j = n - 1;
        for(int i = m - 1; i >=0; i--)
        {
            if(s1.charAt(i) == s2.charAt(j)) j--;
            if(j < 0) return true;
        }
        return false;
    }

    void a() throws Exception
    {
        String str = in.readLine();
        int n = str.length();
        String ending = str.charAt(n - 1) == 's' ? "es" : "s";
        out.println(str + ending);
    }
}