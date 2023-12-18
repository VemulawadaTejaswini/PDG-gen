import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    double tmp = N%2==0 ? (N/2) : (N/2+1);
    System.out.println(tmp/N);
  }
}