public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp0, xp1, yp0, yp1, xp2, yp2, xp3, yp3;
    int q;
    int i;
    double min, d;

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

      min = cross(xp0, xp1, xp2, xp3, yp0, yp1, yp2, yp3);

      d = dist(xp0, yp0, xp1, yp1, xp2, yp2);
      if(min > d)min = d;
      d = dist(xp0, yp0, xp1, yp1, xp3, yp3);
      if(min > d)min = d;
      d = dist(xp2, yp2, xp3, yp3, xp0, yp0);
      if(min > d)min = d;
      d = dist(xp2, yp2, xp3, yp3, xp1, yp1);
      if(min > d)min = d;

      System.out.println(Math.sqrt(min));
    }
    sc.close();
  }

  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }

  private static double dist(
  double p0x, double p0y, double p1x, double p1y, double px, double py){
    double t, d0, d1, x, y;

    t = (p1x - p0x) * (px - p0x) + (p1y - p0y) * (py - p0y);
    t = t / ((p1x - p0x) * (p1x - p0x) + (p1y - p0y) * (p1y - p0y));
    x = p0x + t * (p1x - p0x);
    y = p0y + t * (p1y - p0y);

    if((x - p0x) * (x - p1x) > 0 || (y - p0y) * (y - p1y) > 0){
      d0 = (p0x - x) * (p0x - x) + (p0y - y) * (p0y - y);
      d1 = (p1x - x) * (p1x - x) + (p1y - y) * (p1y - y);
      if(d0 < d1){
        return (px - p0x) * (px - p0x) + (py - p0y) * (py - p0y);
      }else{
        return (px - p1x) * (px - p1x) + (py - p1y) * (py - p1y);
      }
    }else{
      return (px - x) * (px - x) + (py - y) * (py - y);
    }

  }

  private static double cross(
    double xp0, double xp1, double xp2, double xp3,
    double yp0, double yp1, double yp2, double yp3
    ){
    double s1x0, s1y0, s2x0, s2y0, s3x0, s3y0, s10, s20;
    double s1x1, s1y1, s2x1, s2y1, s3x1, s3y1, s11, s21;

    s1x0 = xp1 - xp0;
    s1y0 = yp1 - yp0;
    s2x0 = xp2 - xp0;
    s2y0 = yp2 - yp0;
    s3x0 = xp3 - xp0;
    s3y0 = yp3 - yp0;

    s10 = s1x0 * s2y0 - s1y0 * s2x0;
    s20 = s1x0 * s3y0 - s1y0 * s3x0;

    s1x1 = xp3 - xp2;
    s1y1 = yp3 - yp2;
    s2x1 = xp0 - xp2;
    s2y1 = yp0 - yp2;
    s3x1 = xp1 - xp2;
    s3y1 = yp1 - yp2;

    s11 = s1x1 * s2y1 - s1y1 * s2x1;
    s21 = s1x1 * s3y1 - s1y1 * s3x1;

    if(s10 * s20 > 0 || s11 * s21 > 0){
      return 800000000.0;   //no cross
    }else if(s10 == 0 && s20 == 0 &&
             (s1x0 * s2x0 < 0 || s1y0 * s2y0 < 0) &&
             (s1x0 * s3x0 < 0 || s1y0 * s3y0 < 0)
            ){
              return 800000000.0;   //no cross
    }else if(s10 == 0 && s20 == 0 &&
      ((s1x0 * s1x0) + (s1y0 * s1y0) < (s2x0 * s2x0) + (s2y0 * s2y0)) &&
      ((s1x0 * s1x0) + (s1y0 * s1y0) < (s3x0 * s3x0) + (s3y0 * s3y0))
            ){
              return 800000000.0;   //no cross
    }else{
      return 0.0;   //cross
    }

  }
}