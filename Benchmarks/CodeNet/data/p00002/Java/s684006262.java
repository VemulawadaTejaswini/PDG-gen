import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,sum,digits;
    while(sc.hasNext()){
      digits = 0;
      a = sc.nextInt();
      b = sc.nextInt();
      sum = a + b;
      while(sum >= 1){
        sum /= 10;
        digits++;
      }
      System.out.println(digits);
    }
  }
}