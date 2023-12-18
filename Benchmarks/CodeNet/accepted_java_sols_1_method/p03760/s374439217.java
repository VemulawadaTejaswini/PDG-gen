import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String O = sc.next();
    String E = sc.next();
    String ans = "";
    for (int i=0; i<E.length(); i++) {
      ans += O.charAt(i);
      ans += E.charAt(i);
    }
    if (O.length() > E.length()) ans += O.charAt(O.length() - 1); 
    System.out.println(ans);
  }
}