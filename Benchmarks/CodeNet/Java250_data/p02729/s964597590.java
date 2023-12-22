import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int m = sc.nextInt();
    sc.close();
    int answer = 0;
    answer += (n * (n - 1)) / 2;
    answer += (m * (m - 1)) / 2;
    System.out.println(answer);
  }
}