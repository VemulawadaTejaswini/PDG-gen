import java.util.Scanner;

public class Main{
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int S = scan.nextInt();
    int h, m, s;
    s = S%60;
    m = (S/60)%60;
    h = (S/60/60);
    System.out.println(h + ":" + m + ":" + s);
  }
}