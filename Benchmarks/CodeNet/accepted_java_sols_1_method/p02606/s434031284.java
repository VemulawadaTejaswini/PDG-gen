import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int L = sc.nextInt();
    int R = sc.nextInt();
    int d = sc.nextInt();
    int count = 0;
    
    if(L>=1 && L<=100 && R>=1 && R<=100 && d>=1 && d<=100){
      for(int i = L; i <= R ; i++){
        if(i % d == 0){
          count++;
        }
      }
      System.out.println(count);
      
    }else{
      System.out.println("入力条件に違反しています");
    }
    
  }
  
}