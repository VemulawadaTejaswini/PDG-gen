import java.util.*;

public class Main {

  public static void main (String[] args) {

    Scanner sc = new Scanner(System.in);

    String S = sc.next();

    sc.close();

    // count[0]はaの個数、[1]はbの個数、[25]はzの個数
    int[] count = new int[26];

    for (int i = 0; i < S.length(); i++) {
      count[(int) S.charAt(i) - 97]++;
    }

    String result = "yes";

    for (int i = 0; i < 26; i++) {
      if (2 <= count[i]) {
        result = "no";
        break;
      } 
    }

    System.out.println(result);

  }

}