import java.util.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = s.replace("/","");

    if(t.compareTo("20190430") <= 0) {
      System.out.println("Heisei");
    } else {
      System.out.println("TBD");
    }

  }

}
