import java.util.*;
public class Main {
    public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
 
      //入力
      int N =sc.nextInt();
      List<Integer>d = new ArrayList<>();
      
      //難易度list作成
      for(int i =0; i<N; i++){
      		d.add(sc.nextInt());
      }  
      //昇順に並び替え
      Collections.sort(d);
      
      //真ん中の値が存在しないとき
      if(d.get(N/2)==d.get((N/2)-1)){
        	System.out.println(0);
      }
      //listの真ん中の2つの整数の差を求める
      else {
        	System.out.println(d.get(N/2)-d.get((N/2)-1));
      }
    }
}