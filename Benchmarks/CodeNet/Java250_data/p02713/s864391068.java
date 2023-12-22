import java.util.Scanner;
class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int k;
    k = sc.nextInt();
    long sum = 0;
    for(int a = 1; a <= k ; a++){
      for(int b = 1; b <=k; b++){
        for(int c = 1; c<=k; c++){
          sum += gcd(c,gcd(a,b));
        }
      }
    }
    System.out.println(sum);
  }

  public static int gcd(int x, int y){ //最大公約数
    if(x<y){
      return gcd(y,x);
    }
    if(y == 0){
      return x;
    }
    return gcd(y,x%y);
  }
}
