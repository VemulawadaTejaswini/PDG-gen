public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, p, pn, i;
    int[] a;

    for(;;){
      n = sc.nextInt(); p = sc.nextInt();
      if(n == 0 && p == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = 0;
      pn = p;

      for(i = 0;;i++){
        i = i % n;
        if(p != 0){
          a[i]++; p--;
        }else{
          p += a[i]; a[i] = 0;
        }
        if(a[i] == pn)break;
      }

      out.println(i);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}