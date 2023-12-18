import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    String s = stdIn.next();
    int count = 0;
    char[] a = new char[s.length()];
    char b = 'a';
    for(int i = 0;i<s.length();i++) {
      b = s.charAt(i);
      if(b=='o') {
	count += 1;
	}
    }
    if((15-s.length())+count>=8) {
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}
