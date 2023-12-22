import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans = 0;

    if(b * 2 < a){
      ans = a - b * 2;
    }

    System.out.println(ans);
  }
}
