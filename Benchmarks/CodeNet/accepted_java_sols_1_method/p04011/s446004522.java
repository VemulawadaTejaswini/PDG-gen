import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    // 標準入力から整数を取得
    // N,K,X,Y
 
    int n = scanner.nextInt();
    int k = scanner.nextInt();
    int x = scanner.nextInt();
    int y = scanner.nextInt();
    
    //NがK以下の場合、宿泊数 * X
    if(n <= k) {
      System.out.println(n * x);
	
    // NがKより大きい場合、K * X + (N - K) * Y　を出力 
    } else {
      int z = n - k;
      System.out.println(k * x + z * y);
    }
  }
}