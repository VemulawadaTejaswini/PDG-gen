import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int month = sc.nextInt();
    int day = sc.nextInt();
    if (day >= month) {
      System.out.println(month);
    } else {
      System.out.println(month - 1);
    }
    
  }
}