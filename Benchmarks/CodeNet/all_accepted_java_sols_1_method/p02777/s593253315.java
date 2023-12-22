import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    String t = sc.next();
    int sNum = sc.nextInt();
    int tNum = sc.nextInt();
    String tar = sc.next();

    if (tar.equals(s)) {
      String ret = Integer.toString(sNum - 1);
      System.out.println(ret + " " + tNum);
    } else {
      String ret = Integer.toString(tNum - 1);
      System.out.println(sNum + " " + ret);
    }
  }
}
