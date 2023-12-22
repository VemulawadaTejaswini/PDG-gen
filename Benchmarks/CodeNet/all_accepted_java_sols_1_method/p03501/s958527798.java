import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt(),a = sc.nextInt(),b = sc.nextInt();
    int ans = a * n;
    if(ans > b){
      ans = b;
    }
    System.out.println(ans);
  }
}
