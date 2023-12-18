public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int m, n;
    int i;

    m = sc.nextInt();
    n = sc.nextInt();
    System.out.println(power(m, n));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int power(int m, int n){
    int q, r;

    if(n == 1)return m;
    else{
      q = n / 2;
      r = n % 2;
      return (power(((m * m) % 1000000007), q) + m * r);
    }

  }
}