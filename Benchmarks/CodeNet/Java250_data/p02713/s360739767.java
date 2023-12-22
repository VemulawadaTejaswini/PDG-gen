import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int K = scanner.nextInt();
    int sum = 0;
    for(int i = 1;i < K + 1;i++){
      for(int j = 1;j < K + 1;j++){
        for(int k = 1;k < K + 1;k++){
          sum = sum + gcd(gcd(i,j),k);
        }
      }
    }
    System.out.println(sum);
  }
  
  static int gcd(int a,int b){
    if(b == 0)
      return a;
    
    return gcd(b,a % b);
  }
}