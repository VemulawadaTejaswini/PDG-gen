import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt(), b = scanner.nextInt(), c = scanner.nextInt();
    scanner.close();
    System.out.println(a * b / 2);

  }

}
