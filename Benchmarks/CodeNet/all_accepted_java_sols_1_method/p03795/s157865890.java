import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int cnt = n / 15;
    System.out.println(n * 800 - cnt * 200);

  }
}