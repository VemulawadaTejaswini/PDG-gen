public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, w, h, i, j, x, y, p;
    int[] fw, fh;

    n = sc.nextInt(); w = sc.nextInt(); h = sc.nextInt();
    fw = new int[w]; fh = new int[h]; j = 0;
    for(;n-- > 0;){
      x = sc.nextInt(); y = sc.nextInt(); p = sc.nextInt();
      if(x - p < 0)fw[0]++;
      else fw[x - p]++;
      if(y - p < 0)fh[0]++;
      else fh[y - p]++;
      if(x + p < w)fw[x + p]--;
      if(y + p < h)fh[y + p]--;
    }
    for(i = 1;i < w;i++)fw[i] += fw[i - 1];
    for(i = 1;i < h;i++)fh[i] += fh[i - 1];

    for(i = 0;i < w;i++)if(fw[i] <= 0)break;
    for(j = 0;j < h;j++)if(fh[j] <= 0)break;
    if(i == w || j == h)out.println("Yes");
    else out.println("No");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}