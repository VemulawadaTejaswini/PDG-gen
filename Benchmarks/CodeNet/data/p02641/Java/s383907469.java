import java.util.*;
import java.lang.Integer; 

public class Main {
  public static void main(String[] args){
    
    int answer = 0; // 返却値
    // 入力
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    if(!sc.hasNext()){
      System.out.println(answer);
       return;
    }
    int n = sc.nextInt();
    
    // nが0のとき
    if(n == 0){
      answer = x;
      System.out.println(answer);
      return;
    }
    
    // 入力値の読み込み
    Set<Integer> pSet = new HashSet<Integer>();
    while(sc.hasNext()){
      pSet.add(sc.nextInt());
    }
    
    // 数字を検索する
    int a = 0;
    while(true){
      if(!pSet.contains(x - a)){
        answer = x - a;
        break;
      }
      if(!pSet.contains(x + a)){
        answer = x + a;
        break;
      }
      a++;
    }
    // 出力
    System.out.println(answer);
  }
}