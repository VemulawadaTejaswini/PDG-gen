import java.util.*;
public class Main {

  public static void main(String[] args) { 
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
      Set<String> said = new HashSet<>();
      
      char prevChar = '0';
      for(int i = 0; i < n; i++) {
        String word = sc.next();
        if(said.contains(word) || i > 0 && prevChar != word.charAt(0)) {
          System.out.println("No");
          return;
        }
        said.add(word);
        prevChar = word.charAt(word.length() - 1);
      }
      System.out.println("Yes");
  }
}