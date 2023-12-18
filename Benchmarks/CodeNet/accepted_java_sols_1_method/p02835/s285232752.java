import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int a1 = input.nextInt();
    int a2 = input.nextInt();
    int a3 = input.nextInt();
    
    int sum = a1 + a2 + a3;
    if (sum >= 22)
      System.out.println("bust");
    else
      System.out.println("win");
  }
}