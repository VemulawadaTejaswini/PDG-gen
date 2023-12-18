import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int S = sc.nextInt(), h, m;
    h = S / 3600;
    S %= 3600;
    m = S / 60;
    S %= 60;
    System.out.println(h + ":" + m + ":" + S);
  }
}