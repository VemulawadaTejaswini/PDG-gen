import java.util.Scanner;
 
class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
 
    int S = scanner.nextInt();
    int h, m, s;

    h = S / 3600;
    S %= 3600;

    m = S /60;
    S %= 60;

    s = S;
 
    System.out.println(h + ":" + m + ":" + s);
    scanner.close();
  }
}
