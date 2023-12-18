public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int m, n, h, i, k;
    boolean[] a;
    
    for(;;){
      n = sc.nextInt(); m = sc.nextInt();
      if(n == 0 && m == 0)break;
      a = new boolean[n];

      h = n;
      for(k = -1;h-- > 0;a[k % n] = true)for(i = 0;i < m;i++)if(a[++k % n])i--;
      out.println((k % n) + 1);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}