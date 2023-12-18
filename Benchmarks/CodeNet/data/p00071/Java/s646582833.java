public class Main{
  static int top;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, h, w, i, j, k;
    char[][] f;
    String s;
    int[] nowh, noww, dh, dw;

    f = new char[14][14]; nowh = new int[64]; noww = new int[64];
    dh = new int[12]; dw = new int[12];
    for(i = 0;i < 3;i++){
      dh[i] = -(i + 1); dw[i] = 0;
      dh[i + 3] = 0; dw[i + 3] = -(i + 1);
      dh[i + 6] = i + 1; dw[i + 6] = 0;
      dh[i + 9] = 0; dw[i + 9] = i + 1;
    }
    n = sc.nextInt();
    for(k = 0;k < n;k++){
      for(i = 3;i < 11;i++){
        s = sc.next();
        for(j = 3;j < 11;j++)f[i][j] = s.charAt(j - 3);
      }
      w = sc.nextInt(); h = sc.nextInt(); w += 2; h += 2;

      top = 0;
      f[h][w] = '0';
      pushhw(nowh, noww, h, w);
      for(;top > 0;){
        h = poph(nowh); w = popw(noww);
        for(i = 0;i < 12;i++)if(f[h + dh[i]][w + dw[i]] == '1'){
          f[h + dh[i]][w + dw[i]] = '0';
          pushhw(nowh, noww, h + dh[i], w + dw[i]);
        }
      }

      out.printf("Data %d:%n", k + 1);
      for(i = 3;i < 11;i++){
        for(j = 3;j < 11;j++)out.print(f[i][j]);
        out.println();
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static int poph(int[] nowh){
    return nowh[--top];
  }
  private static int popw(int[] noww){
    return noww[top];
  }
  private static void pushhw(int[] nowh, int[] noww, int h, int w){
    nowh[top] = h; noww[top++] = w;
    return;
  }
}