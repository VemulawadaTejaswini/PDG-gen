import java.util.*;
public class Main {
    public static void main(String[] args){
      // 入力
      Scanner sc = new Scanner(System.in);
      int K = sc.nextInt();
      
      // 最大公約数の和を算出
      int sum = 0;
      for(int i = 1; i <= K; i++){
        for(int j = i; j <= K; j++){
          for(int k = j; k <= K; k++){
            if(i == j && j == k){
              // 3数が等しい場合、GCD * 1を加算
              sum = sum + extgcd(i,j,k);
            }else if(i == j || j == k){
              // 2数が等しい場合、GCD * 3を加算
              sum = sum + extgcd(i,j,k) * 3;
            }else{
              // 3数が異なる場合、GCD * 6を加算
              sum = sum + extgcd(i,j,k) * 6;
            }
          }
        }
      }
      
      // 出力
      System.out.println(sum);
    }
    
    // 2数の最大公約数を求める関数
    public static int gcd(int a, int b){
      if(b == 0){
        return a;
      }
      
      return gcd(b, a % b);
    }
    
    // 3数の最大公約数を求める関数
    public static int extgcd(int a, int b, int c){
      return gcd(gcd(a, b), c);
    }
}