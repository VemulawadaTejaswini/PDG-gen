import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int len = s.length();
      int[] charArr = new int[26];
      if(len == 26) {
        int i = len - 1;
        for(; i > 0; i--) {
          if(s.charAt(i) > s.charAt(i-1)) break;
        }
        if(i == 0) {
          System.out.println(-1);
        } else {
          for(int j = 0; j < i; j++) 
            charArr[s.charAt(j) - 'a'] = 1;
            
          for(int j = 0; j < charArr.length; j++) {
            if(charArr[j] == 1) continue;
            char curC = (char)(j + 'a');
            if(curC > s.charAt(i-1)) {
              System.out.println(s.substring(0, i-1) + curC);
              return;
            }
          }
          
        }
      } else {
        for(int i = 0; i < len; i++) {
            charArr[s.charAt(i) - 'a'] = 1;
        }
        for(int i = 0; i < 26; i++) {
          if(charArr[i] == 0) {
            System.out.println(s + (char)(i + 'a'));
            return;
          }
        }
      }
  }
}