import java.util.*;
public class Main{

 
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double ans = 1;
    for(int i = 1; i <= n; i++){
      ans = (ans * i) % 1000000007;
    }
 
    System.out.println((int)ans);
  }
}