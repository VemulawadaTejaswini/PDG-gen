import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    Double as[] = new Double[n];
    int y = 0;
    while(sc.hasNext()){
      as[y] = sc.nextDouble();
      y++;
    }
    
    // 結果用
    Set<Double> aSet = new HashSet<Double>();
    // 削除用
    Set<Double> dSet = new HashSet<Double>();
    
    // ソート
    Arrays.sort(as);
    
    // 重複する要素の検索
    for(Double a:as){
      if(aSet.contains(a)){
        dSet.add(a);
      }else{
        aSet.add(a);
      }
    }
    
    // 検索
    for(int i=0;i<n;i++){
      Double ai = as[i];
      
      if(ai*2 > as[n-1]){
        // 終了条件
        break;
      }
      
      if(!dSet.contains(ai)){
        int j = 2;
        while(ai <= as[n-1]){
          // 倍数
          ai = as[i] * j;
          if(aSet.contains(ai)){
            // セットにある場合、倍数を削除
            aSet.remove(ai);
          }
          j++;
        }
      }
    }
    // 同じ数字が複数存在する場合は削除
    aSet.removeAll(dSet);
    // 出力
    System.out.println(aSet.size());
  }
}
