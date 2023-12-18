import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String text1 = sc.next();
    String text2 = sc.next();
    
    char[] c1 = new char[text1.length()];
    char[] c2 = new char[text2.length()];
    
    int count = 0;
    for (int i = 0; i < text1.length(); i++) {
      	c1[i] = text1.charAt(i);
      	c2[i] = text2.charAt(i);
      
      	if (c1[i] != c2[i]) {
          count++;
        }
    }
    System.out.println(count);
  }
}