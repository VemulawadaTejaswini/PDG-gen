import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int[] list = new int[26];
    String alphabet = "abcdefghijklmnopqrstuvwxyz";

    while (scan.hasNextLine()) {

      String str = scan.nextLine();

      for (int i = 0; i < str.length(); i++) {
        char ch = str.charAt(i);
        int index = Character.getNumericValue(ch) - 10;
        if (index >= 0) {
          list[index]++;
        }
      }

    }
    
    for (int i = 0; i < 26; i++) {
      System.out.println(alphabet.charAt(i) + " : " + list[i]);
    }

  }

}
