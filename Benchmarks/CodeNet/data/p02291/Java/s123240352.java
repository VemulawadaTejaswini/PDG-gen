public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp1, xp2, yp1, yp2;
    int q;
    double[] xp, yp;
    double ansx, ansy, t;
    int i;

    xp1 = sc.nextDouble();
    yp1 = sc.nextDouble();
    xp2 = sc.nextDouble();
    yp2 = sc.nextDouble();
    q = sc.nextInt();
    xp = new double[q];
    yp = new double[q];

    for(i = 0;i < q;i++){
      xp[i] = sc.nextDouble();
      yp[i] = sc.nextDouble();
    }
    sc.close();

    for(i = 0;i < q;i++){
      t = (xp2 - xp1) * (xp[i] - xp1) + (yp2 - yp1) * (yp[i] - yp1);
      t = t / ((xp2 - xp1) * (xp2 - xp1) + (yp2 - yp1) * (yp2 - yp1));
      ansx = xp1 + t * (xp2 - xp1);
      ansx = ansx + (ansx - xp[i]);;
      ansy = yp1 + t * (yp2 - yp1);
      ansy = ansy + (ansy - yp[i]);
      System.out.printf("%.10f %.10f%n", ansx, ansy);
    }

  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}