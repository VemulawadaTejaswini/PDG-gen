import java.util.*;
public class Main{
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
    int a,b,a_digits,b_digits;
    while( true ){
      a_digits = 0;
      b_digits = 0;
      a = -1;
      b = -1;
      a = sc.nextInt();
      b = sc.nextInt();
      if (a<0 && b<0)break;
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