import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    int hun = n / x;
    if (n % x != 0){
      hun+= 1;
    }
    System.out.println(hun * t );
    sc.close();
  }
}