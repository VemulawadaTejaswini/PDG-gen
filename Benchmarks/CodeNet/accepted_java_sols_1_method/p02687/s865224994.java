import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    /** constance */
    String conABC = "ABC";
    String conARC = "ARC";
      
    /** Scanner */
    Scanner sc = new Scanner(System.in);
    
    /** input */
    String lastHolded = sc.next();

    if(lastHolded.equals(conABC)){
      System.out.println(conARC);
    } else {
      System.out.println(conABC);
    }

  }
}
