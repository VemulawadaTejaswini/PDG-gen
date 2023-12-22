public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double r;
    r = sc.nextDouble();

    System.out.printf("%f %f%n", r * r * Math.PI, 2.0 * r * Math.PI);
/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}