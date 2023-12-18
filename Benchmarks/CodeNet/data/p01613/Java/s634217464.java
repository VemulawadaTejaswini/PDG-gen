public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i, j, tmp;
    int[] a = new int[4];
    int[] d = new int[4];
    n = sc.nextInt();
    for(i = 0;i < 4;i++)a[i] = sc.nextInt() - 1;
    int min = 100000;
    for(i = 1;i <= n;i++){
      for(j = 0;j < 4;j+=2){
        d[j] = a[j] / i - a[j + 1] / i;
        d[j + 1] = a[j] % i - a[j + 1] % i;
      }
      for(j = 0;j < 4;j++)if(d[j] < 0)d[j] *= -1;
      if(min > d[0] + d[1] + d[2] + d[3])min = d[0] + d[1] + d[2] + d[3];
    }
    out.println(min);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}