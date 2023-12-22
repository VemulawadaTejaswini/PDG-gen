import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    int y = sc.nextInt();
    int d = y - (2 * x);
    if( d >= 0 && d % 2 == 0 && (d / 2) <= x){
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}