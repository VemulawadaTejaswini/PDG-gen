import java.util.*;

public class Main{
  public static void main(String[] args){
  	Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    int x = sc.nextInt();
    int t = sc.nextInt();
    
    int cnt = n/x;
    cnt *= t;
    if(n%x != 0)
      cnt += t;
    
    System.out.println(cnt);
  }
}