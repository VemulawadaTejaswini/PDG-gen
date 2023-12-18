public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, q, m;
    int[] a;
    int i;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();

    q = sc.nextInt();
    for(i = 0;i < q;i++){
      m = sc.nextInt();
      if(isin(a, m, n))out.println("yes");
      else out.println("no");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
  private static boolean isin(int[] a, int m, int n){
    if(m == 0)return true;
    else if(n == 0)return false;
    else return (isin(a, m, n - 1) || isin(a, m - a[n - 1], n - 1));
  }
}