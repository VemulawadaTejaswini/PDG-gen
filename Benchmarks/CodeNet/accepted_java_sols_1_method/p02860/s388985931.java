import java.util.*;

public class Main {
  public static void main(String... args) {
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String S = scan.next();    
    System.out.println(S.substring(0,N/2).equals(S.substring(N/2,N)) ? "Yes" : "No");
  }
}