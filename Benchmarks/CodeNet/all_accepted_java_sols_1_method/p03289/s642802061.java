import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      if(s.charAt(0) != 'A') {
        System.out.println("WA");
        return;
      }

      String subS = s.substring(Math.min(2, s.length()-1), Math.max(2, s.length()-1));
      int cnt = 0;
      int idx = -1;
      for(int i = 0; i < subS.length(); i++) {
        if(subS.charAt(i) == 'C') {
          cnt++;
          idx = i + 2;
        }
      }
      if(cnt != 1) {
        System.out.println("WA");
        return;
      }
      for(int i = 1; i < s.length(); i++) {
        if(i == idx) continue;
        if(!Character.isLowerCase(s.charAt(i))){
          System.out.println("WA");
          return;
        }
      }

      System.out.println("AC");
  }
}