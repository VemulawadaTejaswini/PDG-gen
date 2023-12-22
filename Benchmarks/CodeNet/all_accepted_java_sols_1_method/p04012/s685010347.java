import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    String[] w = scanner.nextLine().split("");
    
    // どの文字がいくつあるか
    HashMap<String, Integer> map = new HashMap<>();
    for(String word: w) {
      // マップから今の値を取得
      Integer num = map.get(word);
      // これがnullなら1をマップにいれる
      if(num == null) {
        map.put(word, 1);
      } else {
        // そうでなければその値 + 1をマップに戻す
        map.put(word, num + 1);
      }
    }
    
    // マップの「キーのコレクション」から「それぞれのキー」を取り出す
    boolean flg = true;
    for(String key: map.keySet()) {
      // 「キー」に対応した「値」が偶数か調べる
      if(map.get(key) % 2 != 0) {
        flg = false;
      }
    }
    
    if(flg) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}