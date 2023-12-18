public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double x, h;

    for(;;){
      x = sc.nextDouble();
      h = sc.nextDouble();
      if(x == 0 && h == 0)break;

      System.out.println(x * x + 2 * Math.sqrt((x / 2.0) * (x / 2.0) + h * h) * x);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}