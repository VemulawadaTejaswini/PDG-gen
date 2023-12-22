import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
      
      //入力
      int N = sc.nextInt();//数列の長さ
      
      //空箱用意
      HashSet youso = new HashSet();
      
      //要素をlistに追加する(重複なし)
      for(int i =1; i<=N; i++){
      		youso.add(sc.next());
      }
      //list内の数とN が一致しているか
      if((youso.size())==(N)){
      	System.out.println("YES");
      }
      else{
        System.out.println("NO");
      }
    }
}