import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = sc.nextLong();
    if(k<=a){
      System.out.println(a - k);
      System.out.println(b);
    }else if(k <= a + b){
      System.out.println(0);
      System.out.println(a+b-k);
    }else{
      System.out.println(0);
      System.out.println(0);
    }
  }
}
