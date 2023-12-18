public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, w, h, i, j, x, y, p;
    int[][] f;

    n = sc.nextInt(); w = sc.nextInt(); h = sc.nextInt();
    f = new int[w][h]; j = 0;
    for(;n-- > 0;){
      x = sc.nextInt(); y = sc.nextInt(); p = sc.nextInt();
      for(i = x - p;i < x + p;i++)for(j = 0;j < h;j++)
        if(i >= 0 && i < w && j >= 0 && j < h)f[i][j]++;
      for(i = 0;i < w;i++)for(j = y - p;j < y + p;j++)
        if(i >= 0 && i < w && j >= 0 && j < h)f[i][j]++;
    }

    for(i = 0;i < w;i++){
      for(j = 0;j < h;j++)if(f[i][j] <= 0)break;
      if(j < h && f[i][j] <= 0)break;
    }
    if(i == w && j == h)out.println("Yes");
    else out.println("No");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}