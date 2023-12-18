import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int num = sc.nextInt();
    int change = 0;
    
    while (num > 1000) {
      num -= 1000;
    }
    
    change = 1000 - num;
    System.out.println(change);
  }
}