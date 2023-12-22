import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;

    if(a > 12){
      ans = b;
    } else if(a > 5){
      ans = b / 2;
    }

    System.out.println(ans);
  }
}
