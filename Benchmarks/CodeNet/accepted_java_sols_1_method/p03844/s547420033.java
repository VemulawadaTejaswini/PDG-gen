import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    int a = scanner.nextInt();
    String op = scanner.next();
    int b = scanner.nextInt();
    
    //　A と B をopに従って計算する
    if(op.equals("+")) {
      System.out.println(a + b);
    } else if(op.equals("-")) {
      System.out.println(a - b);
    } else {
      System.out.println("+か-の演算子を使用してください。");
    }
  }
}