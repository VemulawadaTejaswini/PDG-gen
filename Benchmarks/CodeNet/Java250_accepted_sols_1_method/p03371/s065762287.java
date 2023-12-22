import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int x = sc.nextInt();
    int y = sc.nextInt();
    long ans = x * a + y * b;

    for(int i = 1; i <= Math.max(x, y); i++){
      long buf = i * 2 * c + Math.max(0, x - i) * a + Math.max(0, y - i) * b;
      if(buf < ans){
        ans = buf;
      }
    }

    System.out.println(ans);
  }
}
