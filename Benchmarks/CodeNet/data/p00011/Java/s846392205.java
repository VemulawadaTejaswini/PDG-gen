public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int w, n;
    int[] a, t;
    int i, x, y, tmp;
    String str;

    w = sc.nextInt();
    n = sc.nextInt();
    a = new int[w];
    for(i = 0;i < w;i++){
      a[i] = i;
    }

    for(i = 0;i < n;i++){
      str = sc.next();
      x = str.charAt(0) - '0';
      y = str.charAt(2) - '0';

      tmp = a[x - 1];
      a[x - 1] = a[y - 1];
      a[y - 1] = tmp;
    }

    for(i = 0;i < w;i++){
      System.out.println(a[i] + 1);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}