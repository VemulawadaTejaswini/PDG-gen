import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    int N = scan.nextInt();
    String str = Integer.toString(N);
    int sum = 0;
    
    for (int i = 0; i < str.length(); i++) {
      char ch = str.charAt(i);
      int c = Integer.parseInt(String.valueOf(ch));
      sum = sum + c;
    }

    if (N % sum == 0) {
      System.out.println("Yes");
      return;
    }
    
    System.out.println("No");
  }
}
