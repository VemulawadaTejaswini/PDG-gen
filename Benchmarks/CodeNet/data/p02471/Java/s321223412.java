public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b;
    int[] x, y;

    x = new int[1];
    y = new int[1];
    a = sc.nextInt();
    b = sc.nextInt();
    extgcd(a, b, x, y);
    out.println(x[0] + " " + y[0]);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static void extgcd(int a, int b, int[] x, int[] y){
    int tmp;
    x[0] = 1; y[0] = 0;
    if(b != 0){
      extgcd(b, a % b, y, x);
      y[0] -= (a / b) * x[0];
    }
    return;
  }
}