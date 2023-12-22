import java.util.*;
import java.lang.Math;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
   	int num = sc.nextInt();
    int ans = 0;
    
    ans = 1000*(num/500);
    num %= 500;
    ans += num - num%5;
    
    System.out.println(ans);

  }
}
