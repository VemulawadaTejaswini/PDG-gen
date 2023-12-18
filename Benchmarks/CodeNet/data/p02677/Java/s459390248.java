import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    final int A = sc.nextInt();
    final int B = sc.nextInt();
    final int H = sc.nextInt();
    final int M = sc.nextInt();
    sc.close();
    final double omega_h = 360/12;
    final double omega_m = 360/60;
    final double h_x = A*Math.sin((omega_h*H)*Math.PI/180);
    final double h_y = A*Math.cos((omega_h*H)*Math.PI/180);
    final double m_x = B*Math.sin((omega_m*M)*Math.PI/180);
    final double m_y = B*Math.cos((omega_m*M)*Math.PI/180);
    double ans = Math.sqrt(Math.pow(m_x-h_x,2) + Math.pow(m_y-h_y,2));
    //System.out.println("H("+h_x+","+h_y+"), "+"M("+m_x+","+m_y+"), ");
    System.out.println(ans);
  }
}