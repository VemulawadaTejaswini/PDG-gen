import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();
    int max_diff = 0;

    for (int i = 0; i < t.length(); i++) {
      int j = 0;
      int diff = 0;
      while ((i + j) < t.length()) {
        if (s.charAt(i + j) != t.charAt(i + j)) {
          diff++;
        }
        j++;
      }

      if (max_diff < diff) {
        max_diff = diff;
      }
    }

    System.out.println(max_diff);
  }
}