public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double h, max, min;

    h = sc.nextDouble();
    max = h; min = h;
    for(;sc.hasNext();){
      h = sc.nextDouble();
      if(max < h)max = h;
      if(min > h)min = h;
    }
    out.printf("%f%n", max - min);

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}