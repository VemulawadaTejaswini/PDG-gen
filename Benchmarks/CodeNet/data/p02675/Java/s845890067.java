import java.util.*;
import java.math.*;
import java.lang.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.next();

    String k = n.substring(n.length()-1,n.length());

    if (k.equals("2") || k.equals("4") || k.equals("5") || k.equals("7") || k.equals("9")) {
      System.out.println("hon");
    } else if (k.equals("0") || k.equals("1") || k.equals("6") || k.equals("8")) {
      System.out.println("pon");
    } else {
      System.out.println("bon");
    }

  }

}
