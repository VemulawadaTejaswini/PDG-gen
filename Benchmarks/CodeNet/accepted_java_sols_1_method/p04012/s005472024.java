import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      String s = sc.next();
      int[] chars = new int[26];
      
      for (char c: s.toCharArray()) {
      	chars[c - 'a']++;
      }
      
      for (int i = 0; i < 26; i++) {
      	if (chars[i] % 2 == 1) {
        	System.out.println("No");
          	System.exit(0);
        }
      }
      System.out.println("Yes");
    }
}