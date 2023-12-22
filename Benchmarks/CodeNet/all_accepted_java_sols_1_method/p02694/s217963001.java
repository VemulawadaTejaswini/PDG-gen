import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long X = scan.nextLong();
    scan.close();

    int year = 0;
    long Y = 100;
    while(Y < X) {
      Y *= 1.01;
      year++;
    }
    System.out.println(year);
  }
}