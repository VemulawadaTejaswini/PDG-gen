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
    int deg=Math.abs(hedg-mdeg);
    double cosdeg=Math.cos(deg*Math.pi/180);
    double asrq=a*a;
    double bsqr=b*b;
    double c=Math.sqrt(asr+bsqr-2*a*b*cosdeg);
    System.out.println(c);
  }
}