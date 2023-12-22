import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int tasu = a + b;
    int hiku = a - b;
    int kake = a * b;
    int ans = Math.max(tasu,hiku);
    ans = Math.max(ans,kake);
    System.out.println(ans);

  }
}
