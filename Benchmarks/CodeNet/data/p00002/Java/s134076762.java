import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,a_digits,b_digits;
    while(sc.hasNext()){
      a_digits = 0;
      b_digits = 0;
      a = sc.nextInt();
      b = sc.nextInt();
      while(a >= 1){
        a /= 10;
        a_digits++;
      }
      while(b >= 1){
        b /= 10;
        b_digits++;
      }
      System.out.println(a_digits + b_digits);
    }
  }
}