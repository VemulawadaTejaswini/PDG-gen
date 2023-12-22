import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    if(a + b < c * 2){
      System.out.println(a * x + b * y);
    }else{
      int sum = Math.min(x, y) * 2 * c;
      if(Math.max(x, y) == x){
        if(a > c * 2){
          sum += (x - y) * c * 2;
        }else{
          sum += (x - y) * a;
        }
      }else{
        if(b > c * 2){
          sum += (y - x) * c * 2;
        }else{
          sum += (y - x) * b;
        }
      }
      System.out.println(sum);
    }
  }
}