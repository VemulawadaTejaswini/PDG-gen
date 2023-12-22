import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    for(int i=x;i<10000000;i++){
      if(isPrime(i)){
        System.out.println(i);
        return;
      }
    }
    

  }
  
  public static boolean isPrime(int x){
    boolean result = true;
    for(int i =2;i<(int)Math.floor(Math.sqrt(x));i++){
      if(x%i==0){
        return false;
      }
    }
    return result;
  }
  

  
}
