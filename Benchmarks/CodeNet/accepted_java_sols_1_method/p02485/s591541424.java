import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int ans;
    while(true){
      String x = sc.nextLine();
      if (x.charAt(0) == '0') break;
      ans = 0;
      for(int i = 0; i < x.length() ; i++)
        ans += x.charAt(i) - '0';
      System.out.println(ans);
    }
  }
}