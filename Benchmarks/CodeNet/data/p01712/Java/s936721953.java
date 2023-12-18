public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, w, h, i, j, x, y, p;
    boolean[] fw, fh;

    n = sc.nextInt(); w = sc.nextInt(); h = sc.nextInt();
    fw = new boolean[w]; fh = new boolean[h]; j = 0;
    for(;n-- > 0;){
      x = sc.nextInt(); y = sc.nextInt(); p = sc.nextInt();
      for(i = x - p;i < x + p;i++)if(i >= 0 && i < w)fw[i] = true;
      for(i = y - p;i < y + p;i++)if(i >= 0 && i < h)fh[i] = true;
    }

    for(i = 0;i < w;i++)if(!fw[i])break;
    for(j = 0;j < h;j++)if(!fh[j])break;
    if(i == w || j == h)out.println("Yes");
    else out.println("No");

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}