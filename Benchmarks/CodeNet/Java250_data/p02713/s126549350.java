import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    long sum = 0;
    for(int a = 1; a <= k; a++){
      for(int b = 1; b <= k; b++){
        int sur_1 = gcd(a,b);
        for(int c = 1; c <= k; c++){
          sum += gcd(sur_1,c);
        }
      }
    }
    System.out.println(sum);
  }
  public static int gcd(int x, int y){
    int big = Math.max(x,y);
    int small = Math.min(x,y);
    int surplus = big%small;
    if(surplus == 0){
      return small;
    }
    surplus = gcd(small,surplus);
    return surplus;
  }
}