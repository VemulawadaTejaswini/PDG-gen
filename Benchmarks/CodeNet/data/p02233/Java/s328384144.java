public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int n;
    int[] f;
    int i;

    f = new int[45];
    n = sc.nextInt();
    f[0] = 1;f[1] = 1;
    for(i = 2;i < n + 1;i++)f[i] = f[i - 1] + f[i - 2];

    System.out.println(f[n]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}