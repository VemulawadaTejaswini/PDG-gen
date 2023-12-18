import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    // 入力
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
 	// 結果用
    Set<Integer> aSet = new HashSet<Integer>();
    // 削除用
    Set<Integer> dSet = new HashSet<Integer>();
    while(sc.hasNext()){
      Integer a = Integer.valueOf(sc.nextInt());
      if(aSet.contains(a)){
        dSet.add(a);
      }else{
        aSet.add(a);
      }
    }
    List<Integer> aList = new ArrayList<Integer>(aSet);
    
    // ソート
    Collections.sort(aList);
    
    Integer ae = aList.get(aList.size()-1);
    // 検索
    for(Integer al:aList) {
      if(al*Integer.valueOf(2).compareTo(ae) > 0){
        // 終了条件
        break;
      }
      Integer j = 2;
      if(aSet.contains(al)){          
        Integer ai = al;
        while(ai <= ae){
          // 倍数
          ai = al * j;
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
