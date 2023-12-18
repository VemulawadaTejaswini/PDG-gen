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
    List<Double> aList = new ArrayList<Double>(Arrays.asList(as));
    // 削除用
    Set<Double> deleteSet = new HashSet<Double>();
    
    // ソート
    Arrays.sort(as);
    
    // 検索
    for(int i=0;i<n;i++){
      Double ai = as[i];
      
      // 重複する場合、削除リストに追加
      if(!deleteSet.contains(ai) && aList.contains(ai)){
        int index = aList.indexOf(ai);
        aList.remove(index);
        if(aList.indexOf(ai) != -1){
          deleteSet.add(ai);
        }
        aList.add(index,ai);
      }
      
      if(ai*2 > as[n-1]){
        // 終了条件
        break;
      }

      int j = 2;
      while(ai <= as[n-1]){
        // 倍数
        ai = as[i] * j;
        if(aList.contains(ai)){
          // リストにある場合、倍数を削除
          aList.remove(ai);
        }
        j++;
      }
    }
    // 重複削除
    Set<Double> aSet = new HashSet<Double>(aList);
    // 同じ数字が複数存在する場合は削除
    aSet.removeAll(deleteSet);
    // 出力
    System.out.println(aSet.size());
  }
}
