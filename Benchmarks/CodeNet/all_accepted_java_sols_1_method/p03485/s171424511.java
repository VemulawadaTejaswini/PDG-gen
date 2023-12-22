import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    
    int c = a + b;
    
    if (c % 2 == 0) {
      System.out.println(c / 2);
    } else {
      System.out.println(c / 2 + 1);
    }
  }
}