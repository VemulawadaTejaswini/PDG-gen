import java.util.*;

public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    
    String ans = "No";
    int a = sc.nextInt();
    
    String as = String.valueOf(a);
    String x = as.substring(0, 1);
    String y = as.substring(1, 2);
    String z = as.substring(2, 3);
 
    if ("7".equals(x) || "7".equals(y) || "7".equals(z)) {
      ans = "Yes";
    }
 
    System.out.println(ans);
  }
}