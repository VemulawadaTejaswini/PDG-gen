import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    // 入力値（人数）
    int ninzuu = Integer.parseInt(sc.nextLine());
    // 入力値（身長）
    String height[] = sc.nextLine().split(" ");

    long sum = 0;
    long preHeight = 0;
    for (int i=0; i<ninzuu; i++) {
      long nowHeight = Long.parseLong(height[i]);
      if (preHeight >= 0) {
        // 2人目以降は身長差を計算する
        if (preHeight > nowHeight) {
          // 前の人の方が大きい場合
          sum += preHeight - nowHeight;
        } else {
          // 変数の中身を更新する
          preHeight = nowHeight;
          continue;
        }
      } else {
        // 1人目なのでスキップ
        preHeight = nowHeight;
        continue;
      }
    }

    System.out.println(sum);
  }
}
