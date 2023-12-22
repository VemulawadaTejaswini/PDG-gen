import java.util.*;
 
public class Main {
  public static void main(String[] arguments) {
    
    Scanner sc = new Scanner(System.in);
    String name = sc.next();
    int N = Integer.parseInt(name);
    int rem = N%10;
    
    if (rem == 3) System.out.println("bon");
    else if (rem == 0 || rem == 1 || rem == 6 || rem == 8) System.out.println("pon");
    else System.out.println("hon");
  }
}