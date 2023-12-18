public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    int q;
    double xp0, yp0, xp1, yp1, xp2, yp2, xp3, yp3;
    int i;
    double s1x, s1y, s2x, s2y;

    q = sc.nextInt();

    for(i = 0;i < q;i++){
      xp0 = sc.nextDouble();
      yp0 = sc.nextDouble();
      xp1 = sc.nextDouble();
      yp1 = sc.nextDouble();
      xp2 = sc.nextDouble();
      yp2 = sc.nextDouble();
      xp3 = sc.nextDouble();
      yp3 = sc.nextDouble();

      s1x = xp1 - xp0;
      s1y = yp1 - yp0;
      s2x = xp3 - xp2;
      s2y = yp3 - yp2;

      if((s1y / s1x) == (s2y / s2x)){
        System.out.println("2");
      }else if((s1x * s2x + s1y * s2y) == 0){
        System.out.println("1");
      }else{
        System.out.println("0");
      }
    }

    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}