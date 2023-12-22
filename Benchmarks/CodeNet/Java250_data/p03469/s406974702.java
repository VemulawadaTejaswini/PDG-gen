import java.util.*;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String ns = sc.next();
    String[] s = ns.split("");
    s[3] = "8";
    String answer = "";
    for (int i = 0; i < s.length; i++) {
      answer += s[i];
    }
    System.out.println(answer);
  }
}