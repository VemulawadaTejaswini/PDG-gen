import java.util.*;
public class Main{
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();
    long b = sc.nextLong();
    long k = (a+b)/2;
    if((a+b)%2==0){
      System.out.println(Math.abs(k));
    }else{
      System.out.println("IMPOSSIBLE");
    }
  }
}
