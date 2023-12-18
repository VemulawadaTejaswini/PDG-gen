import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    
    int ans = 0;
    
    ans += n / 500 * 1000;
    n = n % 500;
    ans += n / 5 * 5;
    System.out.println(ans);
  }
}