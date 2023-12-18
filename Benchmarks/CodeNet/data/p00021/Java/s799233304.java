public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
    int n, i;
    double x1, y1, x2, y2, x3, y3, x4, y4;

    n = sc.nextInt();
    for(i = 0;i < n;i++){
      x1 = sc.nextDouble(); y1 = sc.nextDouble();
      x2 = sc.nextDouble(); y2 = sc.nextDouble();
      x3 = sc.nextDouble(); y3 = sc.nextDouble();
      x4 = sc.nextDouble(); y4 = sc.nextDouble();

      l1x = x2 - x1; l1y = y2 - y1;
      l2x = x4 - x3; l2y = y4 - y3;

      if(l1y * l2x == l2y * l1x)out.println("YES");
      else out.println("NO");
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}