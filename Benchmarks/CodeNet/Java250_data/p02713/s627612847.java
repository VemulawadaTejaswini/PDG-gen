import java.util.*;

class Main{
  
  static int gcd(int a, int b){
    if ( a < b )
      gcd(b,a);
    if ( b == 0)
      return a;
    else
      return gcd(b, a % b);
  }
  
  static int gcd_3(int a, int b, int c){
    int X = gcd(a,b);
    return gcd(X,c);
  }
  
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    int sum = 0;
    
    for (int i = 1; i <= K; i++){
      for (int j = 1; j <= K; j++){
        for (int k = 1; k <= K; k++){
          sum = sum + gcd_3(i,j,k);
        }
      }
    }
    
    System.out.println(sum);
  }
  
}