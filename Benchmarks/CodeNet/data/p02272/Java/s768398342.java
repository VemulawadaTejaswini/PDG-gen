public class Main{
  static int infi = 1000000001;
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, count;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++)a[i] = sc.nextInt();

    count = mergesort(a, 0, n);
    for(i = 0;i < n - 1;i++)System.out.print(a[i] + " ");
    System.out.println(a[i]);
    System.out.println(count);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int mergesort(int[] a, int l, int r){
    int m, c;
    if(l + 1 >= r)return 0;
    else{
      m = (l + r) / 2;
      c = mergesort(a, l, m);
      c += mergesort(a, m, r);
      c += merge(a, l, m, r);
      return c;
    }
  }

  private static int merge(int[] a, int l, int m, int r){
    int nl, nr, count;
    int i, j, k;
    int[] al, ar;

    nl = m - l;
    nr = r - m;
    al = new int[nl + 1];
    ar = new int[nr + 1];
    for(i = 0;i < nl;i++)al[i] = a[l + i];
    for(i = 0;i < nr;i++)ar[i] = a[m + i];
    al[nl] = infi;
    ar[nr] = infi;

    i = 0;j = 0;count = 0;

    for(k = l;k < r;k++){
      if(al[i] <= ar[j]){
        a[k] = al[i++];
        count++;
      }else{
        a[k] = ar[j++];
        count++;
      }
    }

    return count;

  }
}