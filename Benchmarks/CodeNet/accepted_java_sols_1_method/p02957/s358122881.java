import java.util.*;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long ans = sc.nextLong() + sc.nextLong();
    if (ans%2 == 1)
      System.out.println("IMPOSSIBLE");
    else
    System.out.println(ans/2);
  }
}
