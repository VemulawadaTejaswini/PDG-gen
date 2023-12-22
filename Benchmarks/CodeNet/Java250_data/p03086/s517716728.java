import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int maxLen = 0;
      int leftIdx = 0;
      Set<Character> set = new HashSet<>();
      set.add('A');
      set.add('C');
      set.add('G');
      set.add('T');
      for(int i = 0; i < s.length(); i++) {
        if(!set.contains(s.charAt(i))) {
          maxLen = Math.max(maxLen, i - leftIdx);
          leftIdx = i + 1;
        }
      }
      maxLen = Math.max(maxLen, s.length() - leftIdx);
      System.out.println(maxLen);
  }
}