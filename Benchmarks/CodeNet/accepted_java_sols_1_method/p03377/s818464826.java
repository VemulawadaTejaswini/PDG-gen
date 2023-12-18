import java.util.Scanner;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a, b, c;
    a = sc.nextInt();
    b = sc.nextInt();
    c = sc.nextInt();
    if (a > c || a + b < c) {
      System.out.println("NO");
    } else {
      System.out.println("YES");
    }
  }
}
