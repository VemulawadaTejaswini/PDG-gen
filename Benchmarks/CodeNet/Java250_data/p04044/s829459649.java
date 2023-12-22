import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      int L = sc.nextInt();
      ArrayList<String> array = new ArrayList<>();
      for(int i = 0; i < N; i++){
        array.add(sc.next());
      }
      
      // 文字列生成
      String result = "";
      for(int i = 0; i < N; i++){
        String min = getMinStr(array);
        result += min;
        array.remove(array.indexOf(min));
      }
      
      // 出力
      System.out.println(result);
    }
    
    // リスト内の最小文字列を探索する関数
    public static String getMinStr(ArrayList<String> array){
      String min = array.get(0);
      for(int i = 0; i < array.size(); i++){
        String target = array.get(i);
        if(min.compareTo(target) > 0){
          min = target;
        }
      }
      
      return min;
    }

}