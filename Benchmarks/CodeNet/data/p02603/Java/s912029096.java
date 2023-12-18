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
    
    long money = 1000l;
    if(n == 1){
      System.out.println(money);
      return;
    }
    
    nextBuy = true;
    long cnt = 0;
    for(int i = 0; i < n; i++){
      
      if(i == n-1 && nextBuy){
        break;
      }

      if(nextBuy) {
        
        cnt = money / (long)a[i];
        money -= cnt * (long)a[i];
        
        nextBuy = !nextBuy;
      } else {
        
        money += cnt * (long)a[i];
        
        nextBuy = !nextBuy;
      }
    }
    
    System.out.println(money);
  }
}
