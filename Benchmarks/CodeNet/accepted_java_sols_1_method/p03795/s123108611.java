import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    //整数の入力
    int N = sc.nextInt();
    
    int x = 0;
    int y = 0;
    
    x = 800 * N;
    y = 200 * (N / 15);
    //x-yの出力
    System.out.println(x - y);
  }
}