import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Main {

  public static void main(String[] args) {
    // たこ焼きのパラメータ取得用リスト
    List<Integer> takoyakiParam = new ArrayList<Integer>();
    
    // 回復量の合計
    int sum = 0;
    
    Scanner scanner = new Scanner(System.in);
    // 指定されたたこ焼きの個数を格納する
    int cnt = scanner.nextInt();
    
    // たこ焼きのパラメータをリストに格納する
    for (int i = 1; i <= cnt; i++){
      int num = scanner.nextInt();
      takoyakiParam.add(num);
    }
    
    // 体力の回復量の計算
    for (int x = 0; x < takoyakiParam.size(); x++){
      for (int y = 0; y < takoyakiParam.size(); y++){
        if(x >= y){
          continue;
        }
        sum += (takoyakiParam.get(x) * takoyakiParam.get(y));
      }
    }
    // 回復量の出力
  System.out.println(sum);
  }
}