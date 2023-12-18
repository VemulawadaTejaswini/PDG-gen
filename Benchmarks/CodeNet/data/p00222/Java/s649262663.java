import java.util.*;

public class Main{
  //O( sqrt(n) )
  //テ」ツつィテ」ツδゥテ」ツδ暗」ツつケテ」ツδ?」ツδ催」ツつケテ」ツ?ァテァツエツ?ヲツ閉ーティツ。ツィテ」ツつ津、ツスツ愿」ツつ凝ヲツ鳴ケテ」ツ?古ゥツォツ佚ゥツ??
  static boolean isPrime(int n){
    if(n <= 1) return false;

    for(int i = 2; i * i <= n; i++){
      if(n % i == 0){
        return false;
      }
    }
    return true;
  }

  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      while(true){
        if(isPrime(n - 0) &&
           isPrime(n - 2) &&
           isPrime(n - 6) &&
           isPrime(n - 8)){
          break;
        }
        n--;
      }

      System.out.println(n);
    }
  }
}