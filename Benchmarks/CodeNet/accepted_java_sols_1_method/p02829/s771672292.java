import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    sc.close();
    
    int ans = 1 + 2 + 3 - A - B;
    System.out.println(ans);
  }
}