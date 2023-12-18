public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, j, k, tmp;

    n = sc.nextInt();
    a = new int[n];

    for(i = 0;i < n;i++){
      a[i] = sc.nextInt();
    }

    for(i = 0;i < n;i++){
      for(j = 0;j < i;j++){
        if(a[j] > a[i]){
          tmp = a[i];
          for(k = 0;k < (i - j);k++){
            a[i - k] = a[i - k - 1];
          }
          a[j] = tmp;
        }
      }
      System.out.print(a[0]);
      for(j = 1;j < n;j++){
        System.out.print(" " + a[j]);
      }
      System.out.println();
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}