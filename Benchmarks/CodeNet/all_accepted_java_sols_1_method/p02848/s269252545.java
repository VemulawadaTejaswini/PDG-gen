import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = Integer.parseInt(stdIn.next());
    String s = stdIn.next();
    String alpha = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

    char[] str = new char[s.length()];
    for (int i = 0; i < s.length(); i++) {
      str[i] = s.charAt(i);
      int ans = alpha.indexOf(str[i]) + n;
      while (ans > 25) {
        ans -= 26;
      }
      System.out.print(alpha.charAt(ans));
    }    
  }
}
