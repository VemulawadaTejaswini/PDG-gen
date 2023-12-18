import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String s = sc.next();
    
    String[] english = {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "M", "N", "O", "P", "Q", "R", "S", "T", "U", "V", "W", "X", "Y", "Z"};
    
    for (int i = 0; i < s.length(); i++) {
      for (int j = 0; j < english.length; j++) {
        if (s.substring(i, i+1).equals(english[j])) {
          int limit = j + n;
          if (limit >= 26) {
            System.out.print(english[j + n - 26]);
          } else {
            System.out.print(english[j+n]);
          }
        }
      }
    }
  }
}