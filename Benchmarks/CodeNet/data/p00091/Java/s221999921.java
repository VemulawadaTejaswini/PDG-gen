public class Main{
  private static class Point{
    public int h, w, t;
    public Point(int h, int w, int t){
      this.h = h; this.w = w; this.t = t;
    }
  }
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, k, x = 10;
    int[][] f;
    Point[] p;
    boolean b;
    top = 0; b = false; f = new int[x][x];
    n = sc.nextInt(); p = new Point[n];

    for(i = 0;i < x;i++)for(j = 0;j < x;j++)f[i][j] = sc.nextInt();
    for(i = 1;i < x - 1;i++)for(j = 1;j < x - 1;j++){
      if(f[i][j] > 0)for(k = 3;k > 0;k--)if(solve(f, n, p, i, j, k)){
        b = true; break;
      }
      if(b){ i = x; j = x; }
    }
    for(i = 0;i < n;i++)out.printf("%d %d %d%n", p[i].w, p[i].h, p[i].t);

    sc.close();
  }
  private static boolean solve(int[][] f, int n, Point[] p, int h, int w, int t){
    int i, j, k, x = 10;
    int[] dh, dw;
    dh = new int[13]; dw = new int[13];
    dh[0] = 0; dw[0] = 0; dh[1] = 0; dw[1] = 1; dh[2] = -1; dw[2] = 0;
    dh[3] = 0; dw[3] = -1; dh[4] = 1; dw[4] = 0; dh[5] = 1; dw[5] = 1;
    dh[6] = -1; dw[6] = 1; dh[7] = -1; dw[7] = -1; dh[8] = 1; dw[8] = -1;
    for(i = 1;i < 5;i++){ dh[8 + i] = dh[i] * 2; dw[8 + i] = dw[i] * 2; }

    if(t == 3 && (h < 2 || w < 2 || h > x - 3 || w > x - 3))return false;
    for(i = 0;i < t * 4 + 1;i++)if(f[h + dh[i]][w + dw[i]] == 0)return false;
    push(p, h, w, t);
    for(i = 0;i < t * 4 + 1;i++)f[h + dh[i]][w + dw[i]]--;

    for(i = 1;i < x - 1;i++)for(j = 1;j < x - 1;j++)
      if(f[i][j] > 0)for(k = 3;k > 0;k--)if(solve(f, n, p, i, j, k))
        return true;

    for(i = 0;i < x;i++)for(j = 0;j < x;j++)if(f[i][j] > 0){
      for(k = 0;k < 4 * t + 1;k++)f[h + dh[k]][w + dw[k]]++;
      top--;
      return false;
    }
    return true;
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static Point pop(Point[] stack){
    return stack[--top];
  }
  private static void push(Point[] stack, int h, int w, int t){
    stack[top++] = new Point(h, w, t);
    return;
  }
}