import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      // 取得
	  double A = sc.nextInt();
      double B = sc.nextInt();
      double H = sc.nextInt();
      double M = sc.nextInt();
      double theta = (double)Math.abs((H*30+0.5*M)-M*6);
      if(theta>=180){
        theta=(double)360.0-theta;
      }
      double ans = A*A+B*B-2*A*B*Math.cos(Math.toRadians(theta));
      ans = Math.sqrt(ans);
      System.out.println(ans);
    }
}