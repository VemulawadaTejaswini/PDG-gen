public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n, m;
    int[] a, b, c, s, score;
    int i, j, k, l, r, mid;

    n = sc.nextInt();
    a = new int[n];
    s = new int[n];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();

    m = sc.nextInt();
    b = new int[m];
    c = new int[m];
    for(i = 0;i < m;i++)b[i] = sc.nextInt();
    for(i = 0;i < m;i++)c[i] = sc.nextInt();

    quicksort(a, 0, n);

    s[0] = a[0];
    for(i = 0;;){
      if(i != 0)s[i] = a[i] + s[i - 1];
      if(i + 1 == n)break;
      for(j = i + 1;j < n;j++){
        if(a[i] == a[j])s[i] += a[j];
        else{
          for(k = i + 1;k < j;k++)s[k] = s[i];
          i = j;
          break;
        }
      }
    }

    for(i = 0;i < m;i++){
      l = 0;
      r = n - 1;
      mid = 0;
      for(;l <= r;){
        mid = (l + r) / 2;
        if(b[i] > a[mid])l = mid + 1;
        else if(b[i] < a[mid])r = mid - 1;
        else break;
      }
      if(c[i] <= s[mid] && a[mid] <= b[i])System.out.println("Yes");
      else System.out.println("No");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void quicksort(int[] x, int p, int r){
    int q;
    if(p < r){
      q = partition(x, p, r);
      quicksort(x, p, q);
      quicksort(x, q + 1, r);
    }
    return;
  }
  private static int partition(int[] x, int t, int s){
    int k, j, tmp;
    for(k = t - 1;;){
      for(j = k + 1;j < s;j++){
        if(x[j] <= x[s - 1]){
          k++;
          tmp = x[k]; x[k] = x[j]; x[j] = tmp;
          if(j == s - 1)return k;
          break;
        }
      }
    }
  }

}