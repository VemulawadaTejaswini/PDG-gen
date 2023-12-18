import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int l = sc.nextInt();
    int r = sc.nextInt();
    int d = sc.nextInt();
    int ans;
    
    if(r % d == 0){
      ans = (r - l) / d + 1;
    } else {
      ans = (r - l) / d;
    }
    System.out.println(ans);
  }
}
