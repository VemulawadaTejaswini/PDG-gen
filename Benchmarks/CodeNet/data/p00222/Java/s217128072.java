import java.util.*;

public class Main{
  //O()
  //テ・ツ可催・ツ?ヲテァツ青?」ツ?ォテヲツ卍づゥツ鳴禿」ツ?古」ツ?凝」ツ?凝」ツつ凝」ツ?古」ツ??ァツエツ?ヲツ閉ーティツ。ツィテ」ツつ津、ツスツソテ」ツ??・ツ崢榲」ツ?崚」ツつ凝・ツ按?」ツ?（sPrimeテ」ツつ暗」ツつ甘ゥツ?淌」ツ??
  static boolean[] erato(int n){
    boolean[] prime = new boolean[n + 1];
    Arrays.fill(prime, true);
    prime[0] = prime[1] = false;

    for(int i = 2; i * i <= n; i++){
      if(!prime[i]) continue;
      for(int j = i + i; j <= n; j += i){
        prime[j] = false;
      }
    }

    return prime;
  }

  //O( sqrt(n) )
  //テ」ツつィテ」ツδゥテ」ツδ暗」ツつケテ」ツδ?」ツδ催」ツつケテ」ツ?ァテァツエツ?ヲツ閉ーティツ。ツィテ」ツつ津、ツスツ愿」ツつ凝ヲツ鳴ケテ」ツ?古ゥツォツ佚ゥツ??
  //  -> テァツオツ静ヲツ楪弋LE
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
    boolean[] prime = erato(10000000);

    while(true){
      int n = sc.nextInt();
      if(n == 0) break;

      while(true){
        if(prime[n] && prime[n - 2] && prime[n - 6] && prime[n - 8]){
          break;
        }
        n--;
      }

      System.out.println(n);
    }
  }
}