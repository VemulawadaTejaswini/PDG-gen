import java.util.Scanner;

class Main {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    String str = scan.nextLine();
    double res = Integer.parseInt(str);
    res = res * 2 * Math.PI;
    System.out.println(res);
  }

}
