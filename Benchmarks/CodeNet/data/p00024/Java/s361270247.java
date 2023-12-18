public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double y, t, v;

    for(;sc.hasNext();){
      v = sc.nextDouble();
      t = v / 9.8;
      y = 4.9 * t * t;
      out.println((int)y / 5 + 2);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}