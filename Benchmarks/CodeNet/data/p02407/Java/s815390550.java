public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, tmp;

    n = sc.nextInt();
    a = new int[n];
    for(i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }

    for(i = 0;i < (n / 2);i++){
      tmp = a[i];
      a[i] = a[n - 1 - i];
      a[n - 1 - i] = tmp;
    }

    for(i = 0;i < (n - 1);i++){
      System.out.print(a[i] + " ");
    }
    System.out.println(a[i]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}