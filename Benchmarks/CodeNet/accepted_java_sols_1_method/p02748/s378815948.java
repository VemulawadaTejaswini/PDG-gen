import java.util.*;
public class Main{
  public static void main (String args[]){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int m = sc.nextInt();
    
    int[] aList = new int[a];
    int[] bList = new int[b];
    
    int aMin = 100000;
    int bMin = 100000;
    
    for(int i = 0; i < a; i++){
      aList[i] = sc.nextInt();
      if (aMin > aList[i]){
        aMin = aList[i];
      }
    }

    for(int i = 0; i < b; i++){
      bList[i] = sc.nextInt();
      if (bMin > bList[i]){
        bMin = bList[i];
      }
    }
    
    int ans = aMin + bMin;

    for(int i = 0; i < m; i++){
      int a1 = sc.nextInt();
      int b1 = sc.nextInt();
      int m1 = sc.nextInt();
      int price = aList[a1-1] + bList[b1-1] - m1;
      
      if (ans > price){
        ans = price;
      } 
    }
    
    System.out.println(ans);
  }
}