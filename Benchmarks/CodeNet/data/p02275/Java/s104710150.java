public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a, b, c;
    int i, j, k;


    n = sc.nextInt();
    a = new int[n];
    b = new int[n];
    k = 10001;
    c = new int[k];

    for(i = 0;i < n;i++){
      a[i] = sc.nextInt();
      c[a[i]]++;
    }

    for(i = 1;i < k;i++)c[i] += c[i - 1];

    for(i = n - 1;i >= 0;i--){
      b[c[a[i]] - 1] = a[i];
      c[a[i]]--;
    }

    for(i = 0;i < n - 1;i++)System.out.print(b[i] + " ");
    System.out.println(b[i]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}