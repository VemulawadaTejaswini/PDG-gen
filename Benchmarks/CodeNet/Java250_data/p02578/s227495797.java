import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int N = Integer.parseInt(sc.nextLine());
    
    int max = 0;
    long ans = 0;
    int tem = 0;
    
    for(int i = 0; i < N; ++i) {
      tem = sc.nextInt();
      if(tem > max) {
        max = tem;
      } else if(tem < max) {
        ans += max - tem;
      }
    }
    System.out.println(ans);
  }
}