public class Main{
  public void run(java.io.InputStream in, java.io.PrintStream out){
    java.util.Scanner sc = new java.util.Scanner(in);
/*answer*/
    double xp0, xp1, yp0, yp1, xp2, yp2, xp3, yp3;
    int q;
    int i;
    double s1x, s1y, s2x, s2y, s3x, s3y, s1, s2;

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
      s2x = xp2 - xp0;
      s2y = yp2 - yp0;
      s3x = xp3 - xp0;
      s3y = yp3 - yp0;

      s1 = s1x * s2y - s1y * s2x;
      s2 = s1x * s3y - s1y * s3x;

      if(s1 * s2 > 0){
        System.out.println("0");  //no
      }else{
        s1x = xp3 - xp2;
        s1y = yp3 - yp2;
        s2x = xp0 - xp2;
        s2y = yp0 - yp2;
        s3x = xp1 - xp2;
        s3y = yp1 - yp2;

        s1 = s1x * s2y - s1y * s2x;
        s2 = s1x * s3y - s1y * s3x;
        if(s1 * s2 > 0){
          System.out.println("0");  //no
        }else{
          System.out.println("1");  //yes
        }
      }
    }

/*fin*/
    sc.close();
  }
  public static void main(String[] args){
    (new Main()).run(System.in, System.out);
  }
}