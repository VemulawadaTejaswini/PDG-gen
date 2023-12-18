
import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
	    Scanner sc = new Scanner(System.in);  //標準入力の宣言
      	int N = sc.nextInt(); //入力数
    
        int x = 800*N;
        int y = 200*(N/15);
    
        System.out.println((x-y));  //答えの確認(提出時には削除)

  }
}