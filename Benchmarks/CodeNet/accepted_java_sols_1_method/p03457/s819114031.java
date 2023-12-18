import java.util.*;
public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int N = sc.nextInt();
    
    int preT = 0;
    int preX = 0;
    int preY = 0;
    
    // 標準入力
    
    for (int i = 0 ; i<N ; i++){
        
        int postT = sc.nextInt();
        int postX = sc.nextInt();
        int postY = sc.nextInt();

        // 移動距離
        int distance = Math.abs(postX-preX)+Math.abs(postY-preY);

        // 目的地到達までの時間
        int dt = postT-preT;

        if(distance > dt || (dt - distance) % 2 != 0){

            System.out.println("No");
            return;
        }

        preT = postT;
        preX = postX;
        preY = postY;
        
    }
    sc.close();
    System.out.println("Yes");
  }
 
}