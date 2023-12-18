public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, r, i, j, k, p, c, tmp;
    int[] a;

    for(;;){
      n = sc.nextInt(); r = sc.nextInt();
      if(n == 0 && r == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = n - i;

      for(i = 0;i < r;i++){
        p = sc.nextInt(); c = sc.nextInt(); p--;
        for(j = 0;j < c;j++){
          tmp = a[p + j];
          for(k = 0;k < p;k++)a[p + j - k] = a[p + j - 1 - k];
          a[j] = tmp;
        }
      }
      out.println(a[0]);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}