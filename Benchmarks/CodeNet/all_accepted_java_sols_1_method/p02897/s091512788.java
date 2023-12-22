import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    double n = sc.nextDouble();
    double ans = 0.5;
    if(n % 2 == 1){
      ans = (n+1)/2/n;
    }
    System.out.println(ans);
  }
}
