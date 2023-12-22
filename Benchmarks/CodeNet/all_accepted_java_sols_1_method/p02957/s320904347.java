import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    
    int K;
    boolean flg = false;
    
    /*
    * A <= B のとき A <= K <= B,
    * A > B のとき B < K < A でなければならない
    */
    
    if(A <= B){
      for(K = A; K <= B; K++){
        int minus = -1 * (A - K);
        int plus = B - K;
        
        if(minus == plus){
          System.out.println(K);
          flg = true;
          break;
        }
      }
      
    } else {
      for(K = B + 1; K < A; K++){
        int minus = -1 * (B - K);
        int plus = A - K;
        
        if(minus == plus){
          System.out.println(K);
          flg = true;
          break;
        }
      }
    }
    
    if(flg == false){
      System.out.println("IMPOSSIBLE");
    }
  }
}