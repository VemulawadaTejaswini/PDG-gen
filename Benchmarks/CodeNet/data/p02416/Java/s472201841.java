import java.util.Scanner;
public class Main {
  public static int sumDigits(String n) {
    int sum = 0;
    String[] nAry = n.split("");
    for (int i = nAry.length-1; i >= 0; i--) {
      sum += Integer.parseInt(nAry[i]);
    }
    return sum;
  }
  public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    String n = s.next();
    while (!n.equals("0")) {
      System.out.println(sumDigits(n));
      n = s.next();
    }
    s.close();
  }
}

