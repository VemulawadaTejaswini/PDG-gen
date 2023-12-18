import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    
    // 結果用
    List<Integer> aList = new ArrayList<Integer>();
    // 削除用
    Set<Integer> dSet = new HashSet<Integer>();

    
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    while(sc.hasNext()){
      Integer a = Integer.valueOf(sc.nextInt());
      if(aList.contains(a)){
        dSet.add(a);
      }else{
      	aList.add(a);
      }
    }
    
    Set<Integer> aSet = new HashSet<Integer>(aList);
    // ソート
    Collections.sort(aList);
    
    // 最後の要素
    int ae = aList.get(aList.size()-1).intValue();
    
    // 検索
    for(Integer ai:aList){
      int aif = ai.intValue();
      int aig = aif;
      
      if(aif * 2 > ae){
        // 終了条件
        break;
      }
      if(!aSet.contains(ai)){
        continue;
      }
      
      int j = 2;
      while(aig <= ae){
        // 倍数
        aig = aif * j;
        if(aSet.contains(Integer.valueOf(aig))){
          // セットにある場合、倍数を削除
          aSet.remove(Integer.valueOf(aig));
        }
        j++;
      }
    }
    // 同じ数字が複数存在する場合は削除
    aSet.removeAll(dSet);
    // 出力
    System.out.println(aSet.size());
  }
}
