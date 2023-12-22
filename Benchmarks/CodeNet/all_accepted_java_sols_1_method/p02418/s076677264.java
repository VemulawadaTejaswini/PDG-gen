import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String p = sc.nextLine();
    for (int i = 0; i < s.length(); i++) {
      int j = 0;
      for (; j < p.length(); j++) {
        int ptr = i + j;
        if (ptr >= s.length()) {
          ptr -= s.length();
        }
        if (s.charAt(ptr) != p.charAt(j)) {
          break;
        }
      }
      if (j >= p.length()) {
        System.out.println("Yes");
        return;
      }
    }
    System.out.println("No");
  }
}
