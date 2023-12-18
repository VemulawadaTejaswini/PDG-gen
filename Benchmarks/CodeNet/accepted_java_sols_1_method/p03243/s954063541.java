import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int n_3 = n / 100;
    if(n % 10 <= n_3 && (n / 10) % 10 <= n_3) {
      System.out.println(n_3 * 100 + n_3 * 10 + n_3);
    }else {
      System.out.println((n_3 + 1) * 100 + (n_3 + 1) * 10 + (n_3 + 1));
    }
  }

}
