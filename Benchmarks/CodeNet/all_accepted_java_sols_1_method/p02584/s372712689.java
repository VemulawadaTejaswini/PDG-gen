import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long now = sc.nextLong();
    long num = sc.nextLong();
    long move = sc.nextLong();
    if(now < 0){
      now *= -1;
    }
    long n = now / move;
    if(n >= num){
      System.out.println(now - (num * move));
    }
    else{
      if((num - n) % 2 == 0){
        System.out.println(now - n * move);
      }
      else{
        System.out.println(-(now - (n + 1) * move));
      }
    }
  }
}