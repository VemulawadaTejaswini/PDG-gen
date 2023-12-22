import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    
    for (int i = 1; i <= 5; i++) {
      int A_i = scan.nextInt();
      if (A_i != i) {
        System.out.println(i);
        return;
      }
    }
  }
}
