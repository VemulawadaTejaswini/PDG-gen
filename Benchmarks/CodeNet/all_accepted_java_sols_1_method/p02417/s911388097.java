import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String[] arr = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j", "k", "l",
     "m", "n", "o", "p", "q", "r", "s", "t", "u", "v", "w", "x", "y", "z"};
    int[] ans = new int[26];
    StringBuilder sb = new StringBuilder();
    while(sc.hasNext()) {
      sb.append(sc.next());
    }
    String s = sb.toString().toLowerCase();
    for(int i = 0; i < s.length(); i++) {
      for(int j = 0; j < 26; j++) {
        if(s.substring(i, i + 1).equals(arr[j])) {
          ans[j]++;
          break;
        }
      }
    }
    for(int i = 0; i < 26; i++) {
      System.out.println(arr[i] + " : " + ans[i]);
    }
  }
}

