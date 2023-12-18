import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int d = sc.nextInt();
    int ans = 0;
    if (Math.abs(a-c) <= d){
      ans++;
    }else if (Math.abs(a-b) <= d && Math.abs(b-c)<= d){
      ans++;
    }
    System.out.println(ans == 0 ? "No" : "Yes");
  }
}
