
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String n = sc.nextLine();
    sc.close();

    if(n.length() == 4) {
      int bill = Integer.parseInt(n.substring(1, 4));
      if(bill == 0) {
        System.out.println(0);
      }else {
        System.out.println(1000 - bill);
      }

    }else if(n.length() == 5) {
      System.out.println(0);
    }else {
      System.out.println(1000 - Integer.parseInt(n));
    }
  }

}
