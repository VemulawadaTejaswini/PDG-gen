import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    boolean check = true;
    boolean check2 = true;
    for (int i = 0; i < s.length(); i+=2) {
      if (!"RUD".contains(s.substring(i, i+1))) {
        check = false;
        break;
      }
    }
    for (int i = 1; i < s.length(); i+=2) {
      if (!"LUD".contains(s.substring(i, i+1))) {
        check2 = false;
        break;
      }
    }
    if (check && check2) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}