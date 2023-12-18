import java.util.*;
 
class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    //人数
    int n = sc.nextInt();
    //身長
    int[] h = new int[n];
    
    for(int i = 0;i < n;i++){
      h[i] = sc.nextInt();
    }
    
    
    
    int[] step = new int[n];
    int ans = 0;
    for(int i = 1;i < n;i++){
      if(h[i - 1] > h[i]){
        step[i] = h[i - 1] - h[i];
        h[i] += step[i];
      }
    }
    
    for(int i = 0;i < n;i++){
      ans += step[i];
    }
    System.out.print(ans);
  }
}