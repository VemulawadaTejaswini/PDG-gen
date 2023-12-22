import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    boolean isPrime = false;
    
    for(int i = n; !isPrime; i++){
      boolean flg = true;
      
      for(int j = 2; flg && j <= Math.sqrt(n); j++){
        if(i % j == 0){
          flg = false;
        }
      }
      
      if(flg){
        System.out.println(i);
        isPrime = true;
      }
    }
  }
}