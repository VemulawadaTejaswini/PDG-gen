public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] a;
    int i, j, k, max, sum;

    for(;;){
      n = sc.nextInt();
      if(n == 0)break;
      a = new int[n];
      for(i = 0;i < n;i++)a[i] = sc.nextInt();

      max = a[0];
      for(i = 0;i < n;i++){
        for(j = i + 1;j < n + 1;j++){
          sum = 0;
          for(k = i;k < j;k++)sum += a[k];
          if(max < sum)max = sum;
        }
      }
      System.out.println(max);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}