import java.util.*;
import java.math.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    char[] b = a.toCharArray();
    int[] count = new int[2];
    for(char i : b) {
      count[i - 'A']++;
    }
    if(count[0] == 0 || count[1] == 0) System.out.println("No");
    else System.out.println("Yes");
  }
}