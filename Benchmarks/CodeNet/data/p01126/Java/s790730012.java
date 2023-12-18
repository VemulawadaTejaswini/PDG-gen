public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m, a;
    int[] x, h, p, q;
    int i, j, tmp;

    for(;;){
      n = sc.nextInt();
      m = sc.nextInt();
      a = sc.nextInt();
      if(n == 0)break;

      x = new int[n];
      h = new int[m];
      p = new int[m];
      q = new int[m];

      for(i = 0;i < n;i++)x[i] = i + 1;
      for(i = 0;i < m;i++){
        h[i] = sc.nextInt();
        p[i] = sc.nextInt();
        q[i] = sc.nextInt();
      }

      quicksort(h, p, q, 0, m);
      for(i = 0;i < m;i++){
        tmp = x[p[i] - 1]; x[p[i] - 1] = x[q[i] - 1]; x[q[i] - 1] = tmp;
      }

      for(i = 0;i < n;i++){
        if(a - 1 == x[i] - 1)System.out.println(i + 1);
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void quicksort(int[] h, int[] p, int[] q, int l, int r){
    int mid;
    if(l < r){
      mid = partition(h, p, q, l, r);
      quicksort(h, p, q, l, mid);
      quicksort(h, p, q, mid + 1, r);
    }
    return;
  }
  private static int partition(int[] h, int[] p, int[] q, int t, int s){
    int k, j, tmp;
    for(k = t - 1;;){
      for(j = k + 1;j < s;j++){
        if(h[j] >= h[s - 1]){
          k++;
          tmp = h[k];h[k] = h[j];h[j] = tmp;
          tmp = p[k];p[k] = p[j];p[j] = tmp;
          tmp = q[k];q[k] = q[j];q[j] = tmp;
          if(j == s - 1)return k;
          break;
        }
      }
    }

  }

}