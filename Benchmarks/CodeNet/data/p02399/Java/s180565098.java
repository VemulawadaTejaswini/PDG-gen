import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    System.out.print(a/b + " ");
    System.out.print(a%b + " ");
    String str = String.format("%.5f",(double)a/b);
    System.out.println(str);
  }
}