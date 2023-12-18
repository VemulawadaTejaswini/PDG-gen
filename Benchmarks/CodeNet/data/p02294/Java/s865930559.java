public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp0, xp1, yp0, yp1, xp2, yp2, xp3, yp3;
    int q;
    int i;
    double s1x0, s1y0, s2x0, s2y0, s3x0, s3y0, s10, s20;
    double s1x1, s1y1, s2x1, s2y1, s3x1, s3y1, s11, s21;

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
        System.out.println("0");  //no
      }else if(s10 == 0 && s20 == 0 &&
               (s1x0 * s2x0 < 0 || s1y0 * s2y0 < 0) &&
               (s1x0 * s3x0 < 0 || s1y0 * s3y0 < 0)
              ){
        System.out.println("0");  //no
      }else if(s20 == 0 && s21 == 0 &&
               (s1x1 * s2x1 < 0 || s1y1 * s2y1 < 0) &&
               (s1x1 * s3x1 < 0 || s1y1 * s3y1 < 0)
              ){
        System.out.println("0");  //no
      }else{
        System.out.println("1");  //yes
      }
    }

/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}