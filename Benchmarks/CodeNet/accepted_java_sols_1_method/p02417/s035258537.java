import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] list = new int[26];
    while (sc.hasNext()) {
      char[] cList = sc.nextLine().toLowerCase().toCharArray();
      for (char c : cList) {
        int num = c;
        if (num >= 'a' && num <= 'z') {
          list[num - 'a'] += 1;
        }
      }
    }
    for (int i = 0; i < list.length; i++) {
      System.out.printf("%c : %d\n", i + 'a', list[i]);
    }
  }
}
