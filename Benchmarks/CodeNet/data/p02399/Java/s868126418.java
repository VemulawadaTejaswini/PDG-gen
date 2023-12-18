public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b;
    a = sc.nextInt();
    b = sc.nextInt();

    System.out.printf("%d %d %f%n", a / b, a % b, a / (double)b);
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}