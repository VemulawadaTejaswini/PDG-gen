import java.util.Scanner;
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    int r = N;
    while(r > 0) {
      r = r - 1000;
    }
    System.out.println(-r);
  }
}