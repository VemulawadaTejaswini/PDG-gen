import java.util.*;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int a = sc.nextInt();
    int b = sc.nextInt();
    int total = 0;
    
    for(int i = 1; i <= n; i++){
      int sum = 0;
      int j = 0;
      j = i;
      // 整数の桁の合計を求める
      while (j != 0) {
        sum += j % 10;
        j /= 10;
      }
      if(sum >= a && sum <= b){
        total += i;
      }
    }
    System.out.println(total);
  }
}