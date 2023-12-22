import java.util.Scanner;
import java.util.Arrays;

public class Main {
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    
    //与えられる値群を配列ではなくインデックス番号として解釈する
    int[] A = new int[100001];
    long sum = 0;
    for (int i = 0; i < N; i++) {
      int a = sc.nextInt(); //値取得
      A[a] += 1; //該当インデックスの値の個数
      sum += a; //与えられた値群の合計
    }
    
    int Q = sc.nextInt();
    
    for (int i = 0; i < Q; i++) {
      int target = sc.nextInt(); //置換対象
      int value = sc.nextInt(); //置換先
      
      A[value] = A[value] + A[target]; //置換対象の値の個数を、置換先にマージ
      sum += (value - target) * A[target]; //合計値への影響は、(置換先-置換対象の差)×置換対象の値の個数
      
      A[target] = 0; //置換しちゃったので値がもうない
      System.out.println(sum);
    }
  }
}