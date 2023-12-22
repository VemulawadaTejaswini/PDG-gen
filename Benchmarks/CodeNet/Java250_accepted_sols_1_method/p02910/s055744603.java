import java.util.*;
public class Main {
    public static void main(String args[]) {
      Scanner read = new Scanner(System.in);
      String s = read.nextLine();
      for(int i = 0; i<s.length(); i++){
          if(i%2 == 0 && s.charAt(i) == 'L'){
              System.out.println("No");
              return;
          }
          else if(i%2 != 0 && s.charAt(i) == 'R'){
              System.out.println("No");
              return;
          }
      }
      System.out.println("Yes");
    }
}