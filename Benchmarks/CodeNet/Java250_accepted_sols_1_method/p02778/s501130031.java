import java.util.*;

public class Main {
  public static void main(String args[]) {
	Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    sc.close();
    
    String T = "";
    for (int i = 0; i < S.length(); i++) {
      T += "x";
    }
    System.out.println(T);
  }
}