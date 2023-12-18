public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] h;
    int sum, m, i, j;

    n = sc.nextInt();
    h = new int[n];
    for(i = 0;i < n;i++)h[i] = sc.nextInt();
    sum = 1; m = n;

    for(i = 1;m > 0;i++){
      if(m <= i * 4)break;
      else sum += i * 4;
      for(j = 0;j < n;j++)if(--h[j] == 0)m--;
    }
    for(i = 0;i < n;i++)sum += h[i];

    out.println(sum);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}