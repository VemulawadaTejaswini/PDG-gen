import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    
    int[] a = new int[n];
    a[0] = sc.nextInt();
    boolean nextBuy = true;
    for(int i = 1; i < n;){
      int a_i = sc.nextInt();
    
      if(nextBuy){
        if(a[i-1] > a_i){
          a[i-1] = a_i;
          n--;
        } else {
          a[i] = a_i;
          i++;
          nextBuy = !nextBuy;
        }
      } else {
        if(a[i-1] < a_i){
          a[i-1] = a_i;
          n--;
        } else {
          a[i] = a_i;
          i++;
          nextBuy = !nextBuy;
        }
      }
    }
    
    int money = 1000;
    if(n == 1){
      System.out.println(money);
      return;
    }
    
    nextBuy = true;
    int cnt = 0;
    for(int i = 0; i < n; i++){

      if(nextBuy) {
        
        cnt = money / a[i];
        money -= cnt * a[i];
        
        nextBuy = !nextBuy;
      } else {
        
        money += cnt * a[i];
        
        nextBuy = !nextBuy;
      }
    }
    
    System.out.println(money);
  }
}
