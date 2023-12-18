public class Main{
  static int head, tail;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int h, w, i, j, k;
    int[][] wallw, wallh, d;
    int[] nowx, nowy;

    for(;;){
      w = sc.nextInt(); h = sc.nextInt();
      if(h == 0 && w == 0)break;
      wallw = new int[h][w]; wallh = new int[h][w]; d = new int[h][w];
      nowx = new int[h * w + 1]; nowy = new int[h * w + 1];

      for(i = 0;i < 2 * h - 1;i++){
        for(j = 0;j < w - 1;j++)wallw[i / 2][j] = sc.nextInt();
        wallw[i / 2][j] = 1;
        if(++i == 2 * h - 1)break;
        for(j = 0;j < w;j++)wallh[i / 2][j] = sc.nextInt();
      }

      head = 0; tail = 0;
      for(i = 0;i < h;i++)for(j = 0;j < w;j++)d[i][j] = 0;

      enqueuexy(nowx, nowy, h * w, 0, 0); d[0][0] = 1;
      for(;isnotEmpty();){
        i = dequeuex(nowx, h * w); j = dequeuey(nowy, h * w);
        if(i != h - 1 && d[i + 1][j] == 0 && wallh[i][j] == 0){
          d[i + 1][j] = d[i][j] + 1; enqueuexy(nowx, nowy, h * w, i + 1, j);
        }
        if(i != 0 && d[i - 1][j] == 0 && wallh[i - 1][j] == 0){
          d[i - 1][j] = d[i][j] + 1; enqueuexy(nowx, nowy, h * w, i - 1, j);
        }
        if(j != w - 1 && d[i][j + 1] == 0 && wallw[i][j] == 0){
          d[i][j + 1] = d[i][j] + 1; enqueuexy(nowx, nowy, h * w, i, j + 1);
        }
        if(j != 0 && d[i][j - 1] == 0 && wallw[i][j - 1] == 0){
          d[i][j - 1] = d[i][j] + 1; enqueuexy(nowx, nowy, h * w, i, j - 1);
        }
      }
      out.println(d[h - 1][w - 1]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static void enqueuexy(int[] nowx, int[] nowy, int n, int x, int y){
    nowx[tail] = x; nowy[tail] = y;
    tail = (tail + 1) % (n + 1);
  }

  private static int dequeuex(int[] nowx, int n){
    return nowx[head % (n + 1)];
  }
  private static int dequeuey(int[] nowy, int n){
    head = (head + 1) % (n + 1);
    return nowy[(n + head) % (n + 1)];
  }

  private static boolean isnotEmpty(){
    if(head == tail)return false;
    else return true;
  }

}