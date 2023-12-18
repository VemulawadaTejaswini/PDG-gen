import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	int a = sc.nextInt();
    int b = sc.nextInt();
    int h = sc.nextInt();
    int m = sc.nextInt();
    int hm = h*60+m;
    double ha = 0.5*hm;
    double ma = 6.0*m;
    double angle = Math.abs(ha-ma);
    if (angle>=180){
      angle=360-angle;
    }
    double c = 0;
    c=Math.sqrt(a*a+b*b-2*a*b*Math.cos(Math.toRadians(angle)));
    System.out.println(c);
  }
}