import java.util.*;

public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str1 = sc.next();
    String str2 = sc.next();
    int A = Integer.valueOf(str1);
    int B = Integer.valueOf(str2);
    
    int ans =  A * B;
    System.out.println(ans);
  }
}