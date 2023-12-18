import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    Double r = scanner.nextDouble();
    String s = String.format("%.6f", r * r * Math.PI);
    String l = String.format("%.6f", 2 * r * Math.PI);
    System.out.println(s + " " + l);
  }
}