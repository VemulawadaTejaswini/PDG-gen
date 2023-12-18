import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();
      int V = sc.nextInt();
      int B = sc.nextInt();
      int W = sc.nextInt();
      int T = sc.nextInt();
      
      // 判定
      String result = "YES";
      if(V <= W){
        result = "NO";
      }else{
        int distance;
        if(A < B){
          distance = B - A;
        }else{
          distance = A - B;
        }
        
        int chase = (V - W) * T;
        if(chase < distance){
          result = "NO";
        }
      }
      
      // 出力
      System.out.println(result);
    }
    

}