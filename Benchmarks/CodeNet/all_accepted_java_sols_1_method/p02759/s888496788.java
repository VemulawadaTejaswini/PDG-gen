import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner scanner = new Scanner(System.in);
    int i =scanner.nextInt();
    int j = ( i / 2 ) + (i % 2);
    System.out.println(j);
    scanner.close();
  }
}