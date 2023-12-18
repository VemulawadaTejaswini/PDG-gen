import java.util.Scanner;

class Main {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
    int count[] = new int[26];

    for(int i = 0; i < 26; i++) {
      count[i] = 0;
    }

    while(sc.hasNext()) {
      String string = sc.next();

      for(int i = 0; i < string.length(); i++) {
        char c = string.charAt(i);
        int index;

        if('A' <= c && c <= 'Z') {
          index = (int)(c - 'A');
        } else if('a' <= c && c <= 'z') {
          index = (int) (c - 'a');
        } else {
          continue;
        }

        count[index]++;
      }
    }

    for(int i = 0; i < 26; i++) {
      System.out.printf("%c:%d\n", i + 'a', count[i]);
    }
  }
}