import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int a = sc.nextInt();
    int b = sc.nextInt();
    int ans;
    
    if((b - 1) % (a - 1) == 0){
      ans = (b - 1) / (a - 1);
    } else {
      ans = ((b - 1) / (a - 1)) + 1;
    }

    System.out.println(ans);
  }
}
