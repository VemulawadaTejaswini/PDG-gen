public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int a, b, g, l;

    for(;sc.hasNext();){
      a = sc.nextInt();
      b = sc.nextInt();

      g = gcd(a, b);
      l = (a / g) * b;

      System.out.println(g + " " + l);
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static int gcd(int a, int b){
    if(a % b == 0){
      return b;
    }else{
      return gcd(b, (a % b));
    }
  }
}