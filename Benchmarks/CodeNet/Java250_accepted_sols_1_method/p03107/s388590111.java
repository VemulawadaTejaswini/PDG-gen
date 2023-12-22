import java.util.Scanner;

class Main {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String s = scanner.next();
    int count0 = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == '0') {
        count0++;
      }
    }
    int ans = count0 <= s.length() / 2 ? count0 : s.length() - count0;
    System.out.println(ans * 2);
  }

}
