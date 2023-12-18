import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    if(x>=1 && x<=1000){
      if (x == 1) {
        System.out.println(1);
        return;
      }
      int max = 1;
      for(int i = 2; i <= x; i++){
        for(int k = 2; Math.pow(i,k) <=x; k++){
          max = Math.max(max,(int)Math.pow(i,k));
         }
      }
        
        System.out.println(max);
      
    }else{
      System.out.println("入力条件が誤っています");
    } 
  }  
}