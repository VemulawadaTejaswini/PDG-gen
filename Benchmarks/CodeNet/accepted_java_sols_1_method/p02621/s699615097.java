import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int a= scanner.nextInt();

    int ans = a + a*a + a*a*a;
    System.out.println(ans);
    
    scanner.close();
    return;
  }
}
