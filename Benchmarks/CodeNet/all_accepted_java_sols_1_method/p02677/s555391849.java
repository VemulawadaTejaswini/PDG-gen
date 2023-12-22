import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    double H = sc.nextInt();
    double M = sc.nextInt();
    // A * A + B * B - 2AB cosA
    // 何度進んでいるか
    double HAngle = H * 30  + M * 0.5;
    double MAngle = M * 6;
    double angle = HAngle - MAngle;
    if (angle < -90 || 90 < angle) {
        angle = 360 - Math.abs(angle);
    }
    double cosA = Math.cos(Math.toRadians(angle));
    double answer = Math.sqrt(A * A + B * B - (2 * A * B * cosA));
    System.out.println(answer);
  }
}