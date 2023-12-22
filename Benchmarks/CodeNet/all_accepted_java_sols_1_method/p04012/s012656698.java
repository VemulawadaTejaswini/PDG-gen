import java.util.Scanner;
import java.util.HashMap;

public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    char[] w = scanner.next().toCharArray();
    boolean[] isOdd = new boolean[26]; // {false, false, false...}
    for(char c: w) {
      int i = c - 'a';
      isOdd[i] = !isOdd[i];
    }
	
    boolean isAllEven = true;
    for(boolean b: isOdd) {
      if(b) {
        isAllEven = false;
      }
    }
    
    if(isAllEven) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
