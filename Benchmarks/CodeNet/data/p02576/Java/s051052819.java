import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    sc.close();
    int answer = (n / x) * t;
    if(n % x != 0) answer += t;
    System.out.println(answer);
  }
}