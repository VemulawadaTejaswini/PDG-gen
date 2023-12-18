public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double x1, y1, x2, y2;

    x1 = sc.nextDouble();
    y1 = sc.nextDouble();
    x2 = sc.nextDouble();
    y2 = sc.nextDouble();
    System.out.println(Math.sqrt((x1 - x2) * (x1 - x2) + (y1 - y2) * (y1 - y2)));

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}