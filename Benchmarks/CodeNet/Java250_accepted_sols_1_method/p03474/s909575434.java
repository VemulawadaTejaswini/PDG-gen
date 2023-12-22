import java.util.*;

public class Main {
  public static void main(String[] args) throws Exception {
    
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    String S = sc.next();
    if (S.length() != A + B + 1){
      System.out.println("No");
    }
    String case1 = S.substring(0, A);
    char case2 = S.charAt(A);
    String case3 = S.substring(A+1);
 
    if (!case1.matches("[0-9]*")) {
      System.out.println("No");
      return;
    }
    if (case2 != '-') {
      System.out.println("No");
      return;
    }
    if (case3.matches("[0-9]*")) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
    