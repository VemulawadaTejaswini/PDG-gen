import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int H = sc.nextInt();
    final int M = sc.nextInt();
    sc.close();
    final double omega_h = 360/12*60*60;
    final double omega_m = 360/60*60;
    final double theta_h = 12/360;
    final double theta_m = 60/360;
    final double rad_h = Math.toRadians(H*60*60*omega_h);
    final double rad_m = Math.toRadians(M*60*omega_m);
    final double h_y = A*Math.sin(Math.toRadians(H*60*60*omega_h));
    final double h_x = A*Math.cos(Math.toRadians(H*60*60*omega_h));
    final double m_x = B*Math.sin(Math.toRadians(M*60*omega_m));
    final double m_y = B*Math.cos(Math.toRadians(M*60*omega_m));
    double expr_y = Math.pow(m_y-h_y,2.0);
    double expr_x = Math.pow(m_x-h_x,2.0);
    double ans = Math.sqrt(expr_x + expr_y);
    System.out.println("H("+h_x+","+h_y+"), "+"M("+m_x+","+m_y+"), ");
    //System.out.println("x:"+expr_x+", y:"+expr_y);
    System.out.println(ans);
  }
}