import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    int ab = a + b;
    
    if (ab >= c) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}