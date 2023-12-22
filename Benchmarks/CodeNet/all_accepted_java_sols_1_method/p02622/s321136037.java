import java.util.Scanner;
import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.nextLine();
    String t = scan.nextLine();
    int sum = 0;
    
    for(int i = 0; i < s.length(); i++) {
      if(s.charAt(i) != t.charAt(i)) {
        sum++;
      }
    }

    System.out.println(sum);
  }
}
