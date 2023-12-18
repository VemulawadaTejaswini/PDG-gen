import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    final Scanner sc = new Scanner(System.in);
    final String s = sc.nextLine();
    final String t = sc.nextLine();
    int max = 0;

    for (int i = 0; i < t.length(); i++) {
      int j = 0;
      while (i + j < t.length() && s.substring(i).contains(t.substring(i, i + j))) {
        j++;
      }
      if (max < j) {
        max = j;
      }
    }

    System.out.println(t.length() - (max - 1));
  }
}