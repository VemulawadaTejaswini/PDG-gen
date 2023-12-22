import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ans = 0;
    for (int i = 0; i < 3; i++){
      int a = sc.nextInt();
      ans += a;
    }
    System.out.println(ans <= 21 ? "win" : "bust");
  }
}
