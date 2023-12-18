import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int D = sc.nextInt();
    
    String[] ans = new String[25+1];
    ans[25] = "Christmas";
    ans[24] = "Christmas Eve";
    ans[23] = "Christmas Eve Eve";
    ans[22] = "Christmas Eve Eve Eve";
    
    System.out.println(ans[D]);
  }
}