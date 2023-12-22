
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    sc.nextLine();
    String s = sc.nextLine();
    sc.close();
    if(s.length() <= k) {
      System.out.println(s);
    }else {
      System.out.println(s.substring(0, k) + "...");
    }
  }

}
