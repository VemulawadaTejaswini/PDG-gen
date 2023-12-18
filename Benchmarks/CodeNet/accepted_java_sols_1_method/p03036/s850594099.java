import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    int r = sc.nextInt();
    int d = sc.nextInt();
    int x = sc.nextInt();
    int ans[] = new int[11];
    ans[0] = x;

    for(int i = 1; i < 11; i++){
      ans[i] = r * ans[i - 1] - d;
      System.out.println(ans[i]);
     }
  }
}
