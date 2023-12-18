import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int ab = a + b;
    int bc = b + c;
    int ca = c + a;
    
    if ((ab <= bc) && (ab <= ca)) {
      System.out.println(ab);
    } else if ((bc <= ab) && (bc <= ca)) {
      System.out.println(bc);
    } else {
      System.out.println(ca);
    }
  }
}