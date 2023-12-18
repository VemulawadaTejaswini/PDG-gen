public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int i, j;
    int[] a;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = sc.nextInt();

      i = 0;
      if(i >= n - 1 || a[i] != a[i + 1] - 1)out.print(a[i++]);
      else{
        for(j = i + 1;j < n;j++)if(j >= n - 1 || a[j] != a[j + 1] - 1){
          out.print(a[i] + "-" + a[j]);
          i = j + 1;
          break;
        }
      }
      for(;i < n;){
        if(i >= n - 1 || a[i] != a[i + 1] - 1)out.print(" " + a[i++]);
        else{
          for(j = i + 1;j < n;j++)if(j >= n - 1 || a[j] != a[j + 1] - 1){
            out.print(" " + a[i] + "-" + a[j]);
            i = j + 1;
            break;
          }
        }
      }
      out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}