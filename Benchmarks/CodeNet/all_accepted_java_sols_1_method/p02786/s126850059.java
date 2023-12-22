import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    long H = scan.nextLong();
    scan.close();

    long n = 1;
    while(H>>n > 0) {
      n++;
    }

    System.out.println(((long)1<<n) - 1);
  }
}