import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 番号の取得
    int num = sc.nextInt();

    // 総和
    int sum = 0;

    for (int i=1; i <= num; i++) {
      for (int j=1; j <= num; j++) {
        // i,jの最大公約数を求める
        int temp1 = 0;
        int x = i;
        int y = j;
        if (x < y) {
          temp1 = x;
          x = y;
          y = temp1;
        }
        // ユークリッド
        while((temp1 = x % y) != 0) {
          x = y;
          y = temp1;
        }
        for (int k=1; k <= num; k++) {
          // y,kの最大公約数を求める
          int temp2 = 0;
          int w = y;
          int z = k;
          if (w < z) {
            temp2 = w;
            w = z;
            z = temp2;
          }
          // ユークリッド
          while((temp2 = w % z) != 0) {
            w = z;
            z = temp2;
          }
          sum += z;
        }
      }
    }
    System.out.println(sum);
  }
}