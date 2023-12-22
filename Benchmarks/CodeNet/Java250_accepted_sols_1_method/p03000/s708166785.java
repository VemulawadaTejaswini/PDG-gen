import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 跳ねる数
    int n = sc.nextInt();
    // 直線の長さ
    int l = sc.nextInt();
    // 直線上を跳ねた数
    int ln = 1;
    // 跳ねる距離の配列
    int bounds[] = new int[n];
    for(int idx=0; idx<n; idx++){
      bounds[idx] = sc.nextInt();
    }
    
    for(int idx=0; idx<n; idx++){
      l -= bounds[idx];
      if(l < 0){
        break;
      }
      ln += 1;
    }
    
    // 出力
    System.out.println(ln);   
  }
}
