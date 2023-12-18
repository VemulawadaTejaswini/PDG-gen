import java.util.Scanner;
import java.math.BigInteger;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double[] position = new double[2];
    int x = 0;
    int theta = 90;
    while(true) {
      String str = sc.next();
      String[] strArr = str.split(",");
      x = Integer.parseInt(strArr[0]);
      position[0] += x*Math.cos(Math.toRadians(theta));
      position[1] += x*Math.sin(Math.toRadians(theta));
      theta -= Integer.parseInt(strArr[1]);
      if (x == 0 && strArr[1].equals("0")) {
        break;
      }
    }
    System.out.println((int)position[0]);
    System.out.println((int)position[1]);
  }
}