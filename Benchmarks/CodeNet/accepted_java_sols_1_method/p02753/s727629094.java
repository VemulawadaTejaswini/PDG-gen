import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String sa = sc.nextLine();
    char[] s = sa.toCharArray();
    Boolean f = (s[0] != s[1] || s[0] != s[2] || s[1] != s[2]);
    if(f) {
      System.out.println("Yes");
    } else {
	  System.out.println("No");
    }
  }
}