import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int[] counter = new int[26];
    while (sc.hasNext()) {
      String str = sc.nextLine();
      for (int i = 0; i < str.length(); i++) {
        int num = 0;
        char ch = str.charAt(i);
        if (Character.isLowerCase(ch)) {
          num = str.charAt(i) - 'a';
        } else {
          num = str.charAt(i) - 'A';
        }
        if (num >= 0 && num <= 26) {
          counter[num]++;
        }
      }
    }
    for (int i = 0; i < counter.length; i++) {
      System.out.println((char)(i + 'a') + " : " + counter[i]);
    }
  }
}
