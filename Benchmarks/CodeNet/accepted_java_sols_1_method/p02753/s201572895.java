import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] abc = sc.next().toCharArray();
    if (abc[0] == abc[1] && abc[1] == abc[2]) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    }
  }
}