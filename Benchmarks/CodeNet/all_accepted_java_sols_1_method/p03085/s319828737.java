import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    String b = sc.next();
    
    if (b.equals("A")) {
      System.out.println("T");
    }
    if (b.equals("T")) {
      System.out.println("A");
    }
    if (b.equals("C")) {
      System.out.println("G");
    }
    if (b.equals("G")) {
      System.out.println("C");
    }
  }
}