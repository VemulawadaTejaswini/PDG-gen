import java.util.Scanner;
class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    double A = scan.nextDouble();
    double B = scan.nextDouble();
    double H = scan.nextDouble();
    double M = scan.nextDouble();
    double hour, minute, c, co, ans;
    hour = H * 30 + M * 0.5;
    minute = M * 6;
    c = hour - minute;
    if (c > 180) {
      c = 360 - c;
    }
    else if (c < 0) {
      c = 360 + c;
    }
    co = Math.cos(Math.toRadians(c));
    ans = A * A + B * B - 2 * A * B * co;
    System.out.println(Math.sqrt(ans));
  }
}

