import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int X = scan.nextInt();
    scan.close();

    System.out.println((X/500)*1000 + ((X%500)/5)*5);
  }
}