import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    if(-40<=X && X <= 40) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}