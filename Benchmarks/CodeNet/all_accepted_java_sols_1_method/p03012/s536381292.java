import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    // 重りの数
    int n = sc.nextInt();
    // 重りたち
    int weights[] = new int[n];
    for(int idx=0; idx<n; idx++){
      weights[idx] = sc.nextInt();
    }
    
    // 前後に分けて足していく
    int s1 = 0, s2 = 0;
    int num = 0;
    int right = 0;
    int left = 0;
    while(true){
      /*
      // 残り2個
      if(n - num == 2){
        s1 + weights[left] + 
      }
      // 残り1個
      if(n - num == 1){
        if(s1 > s2){
          s1 += weights[left];
        }
        break;
      }
      */
      
      // 両側から取る
      if(s1 <= s2){
        s1 += weights[left];
        left ++;
        num ++;
      }
      if(num >= n){
        break;
      }
      if(s2 <= s1){
        s2 += weights[n - 1 - right];
        right ++;
        num ++;
      }
      if(num >= n){
        break;
      }
    }
    
    
    // 出力
    if(s1 > s2){
      System.out.println(s1 - s2);   
    }else{
      System.out.println(s2 - s1);   
    }
  }
}
