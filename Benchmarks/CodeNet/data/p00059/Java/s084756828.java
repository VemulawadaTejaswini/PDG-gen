public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    double[] a, b;
    int i;

    a = new double[4]; b = new double[4];
    for(;sc.hasNext();){
      for(i = 0;i < 4;i++)a[i] = sc.nextDouble();
      for(i = 0;i < 4;i++)b[i] = sc.nextDouble();
      if(judge(a, b))out.println("YES");
      else out.println("NO");
    }
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean judge(double[] a, double[] b){
    int i, j;
    for(i = 0;i < 2;i++)for(j = 0;j < 2;j++)
      if(isin(a, b[i * 2], b[1 + j * 2]))return true;
    for(i = 0;i < 2;i++)for(j = 0;j < 2;j++)
      if(isin(b, a[i * 2], a[1 + j * 2]))return true;
    if(iscross(a, b) || iscross(b, a))return true;
    return false;
  }
  private static boolean isin(double[] a, double x, double y){
    if(a[0] <= x && x <= a[2] && a[1] <= y && y <= a[3])return true;
    return false;
  }
  private static boolean iscross(double[] a, double[] b){
    if(a[0] < b[0] && b[2] < a[2] && b[1] < a[1] && a[3] < b[3])return true;
    return false;
  }
}