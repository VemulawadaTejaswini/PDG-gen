import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    char[] S_char = sc.next().toCharArray();
    int[] count = new int[26];
    for (int i = 0; i < S_char.length; i++) {
      count[S_char[i] - 'a']++;
    }
    for (int i = 0; i < 26; i++) {
      if (count[i] == 0) {
        System.out.println((char)(i + 'a'));
        return;
      }
    }
    System.out.println("None");
  }
}