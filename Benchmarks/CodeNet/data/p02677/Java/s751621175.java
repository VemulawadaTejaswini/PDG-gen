import java.util.*;
class Main{
  public static void main(String args[])
  {
    Scanner sc = new Scanner(System.in);
    int a=sc.nextInt();
    int b=sc.nextInt();
    int h=sc.nextInt();
    int m=sc.nextInt();
    
    int hdeg=30*h;
    int mdeg=6*m;
    int deg=Math.abs(hdeg-mdeg);
    double cosdeg=Math.cos(deg*Math.PI/180);
    double asqr=a*a;
    double bsqr=b*b;
    double c=Math.sqrt(asqr+bsqr-2*a*b*cosdeg);
    System.out.println(c);
  }
}
