import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // 標準入力から整数の入力
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    int h = scanner.nextInt();
    
    // 台形の面積を求める
    // (上辺　+ 底辺)　*　高さ /　2
    System.out.println((a + b) * h / 2);
  }
}