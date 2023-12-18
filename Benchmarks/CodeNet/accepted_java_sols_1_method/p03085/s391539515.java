import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();

    if (str.equals("A")) {
      System.out.println("T");
    }

    if (str.equals("T")) {
      System.out.println("A");
    }

    if (str.equals("G")) {
      System.out.println("C");
    }

    if (str.equals("C")) {
      System.out.println("G");
    }
  }
}
