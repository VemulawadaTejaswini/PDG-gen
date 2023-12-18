import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    int n = scn.nextInt();
    char[] charN = String.valueOf(n).toCharArray();

    String ans = "";
    for (char num : charN) {
      ans += (num == '1') ? "9" : "1";
    }

    System.out.println(ans);

  }

}
