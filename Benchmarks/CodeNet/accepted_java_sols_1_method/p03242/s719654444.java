import java.util.*;
public class Main {
  public static void main(String[] args){

    Scanner sc = new Scanner(System.in);
    String n = sc.next();
    String n1 = n.substring(0,1);
    String n2 = n.substring(1,2);
    String n3 = n.substring(2,3);
    String a1 = "9";
    String a2 = "9";
    String a3 = "9";

    if (n1.equals("9")) {
      a1 = "1";
    }

    if (n2.equals("9")) {
      a2 = "1";
    }

    if (n3.equals("9")) {
      a3 = "1";
    }

    System.out.println(a1 + a2 + a3);

  }
}