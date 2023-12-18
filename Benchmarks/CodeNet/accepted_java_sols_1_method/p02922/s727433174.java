import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;
    while(true){
      int n = (a * ans) - (ans - 1);
      if(b <= n) break;
      ans++;
    }
    System.out.println(ans);
  }
}
