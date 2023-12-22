import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
	String S = sc.next();
    if (head(S) && containC(S) && lowerCase(S)) {
      System.out.println("AC");
    } else {
      System.out.println("WA");
    }
  }
  public static boolean head(String S) {
    if (S.charAt(0) == 'A') {
      return true;
    } else {
      return false;
    }
  }
  public static boolean containC(String S) {
    int length = S.length();
    String substringS = S.substring(2, length - 1);
    substringS = substringS.replace("C", "");
    if (length - 3 == substringS.length() + 1) {
      return true;
    } else {
      return false;
    }
  }
  public static boolean lowerCase(String S) {
    String substringFirst = S.substring(1, 2);
    String substringSecond = S.substring(2, S.length() - 1).replace("C", "");
    String substringThird = S.substring(S.length() - 1);
    if (substringFirst.equals(substringFirst.toLowerCase()) && 
        substringSecond.equals(substringSecond.toLowerCase()) &&
        substringThird.equals(substringThird.toLowerCase())) {
          return true;
    } else {
          return false;
    }
    
  }
}