import java.util.Scanner;

public class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);

    int[] count = new int[26];
    for(int i = 0; i < 26; i++) {
      count[i] = 0;
    }

    while(sc.hasNext()) {
      String input = sc.next();

      for(int i = 0; i < input.length(); i++) {
        char c = input.charAt(i);
        int index;
        if('a' <= c && c <= 'z') {
          index = c - 'a';
        } else if('A' <= c && c <= 'Z') {
          index = c - 'A';
        } else {
          continue;
        }
        count[index]++;
      }
    }

    for(int i = 0; i < 26; i++) {
      System.out.printf("%c : %d\n", 'a' + i, count[i]);
    }
  }
}