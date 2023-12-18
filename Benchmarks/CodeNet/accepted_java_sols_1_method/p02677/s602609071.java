import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    long b = scan.nextLong();
    int c = scan.nextInt();
    int d = scan.nextInt();
    double e = 0;
    long f = 0;
    for (int i=0;i<d;i++){
      f += 6;
      e += 0.5;
    }
    for (int j=0;j<c;j++){
      e += 30;
    }

    double t = e-f;
    while ((t>180)||(t<0)){
      if (t<0){
        t+=360;
        continue;
      }
      if (t>180){
        t = 360 - t;
      }
    }

    double radian = Math.toRadians(t);
    double gg = a*a+b*b-2*a*b*(Math.cos(radian));
    gg = Math.sqrt(gg);
    System.out.println(gg);
  }
}
