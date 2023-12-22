import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String N = sc.nextLine();
    
    int num = 0;
    
    for(int i = 0; i < N.length(); ++i) {
      num += Character.getNumericValue(N.charAt(i));
    }
    
    System.out.println(num % 9 == 0 ? "Yes" : "No");
  }
}