import java.util.Scanner;

public class Main {
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s1 = scan.next();
    String s2 = scan.next();
    scan.close();
    
    if (s1.charAt(0) == s2.charAt(2) && s1.charAt(1) == s2.charAt(1) && s1.charAt(2) == s2.charAt(0)) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
}
}
