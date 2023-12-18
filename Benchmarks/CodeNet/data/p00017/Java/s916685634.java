import java.util.Scanner;

class Main {
  public static char caesar(char c) {
    if(c == 'z') {
      return 'a';
    }
    else if(c == 'Z') {
      return 'A';
    }
    else if(97 <= (int)c && (int)c <= 122) {
      return (char)(((int)c) + 1);
    }
    else {
      return c;
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String text = sc.nextLine();
    while(true) {
      if(text.contains("the") || text.contains("this") || text.contains("that")) {
        System.out.println(text);
	break;
      }
      String tmp="";  
      char[] chars = text.toCharArray();
      for(int i=0; i<chars.length; i++) {
        tmp += caesar(chars[i]);
      }
      text = tmp;
    }
  }
}