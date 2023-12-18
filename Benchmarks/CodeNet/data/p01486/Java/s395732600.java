import java.util.*;

class Main{
  static int cursor = 0;
  static char[] input;

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    input = scan.next().toCharArray();
    System.out.println((check()&&(cursor==input.length))?"Cat":"Rabbit");
  }

  public static boolean check() {
    if(input[cursor]!='m') return false;
    cursor++;
    if(input[cursor]=='m') {
      if(!check()) return false;
    }
    if(input[cursor]!='e') return false;
    cursor++;
    if(input[cursor]=='m') {
      if(!check()) return false;
    }
    if(input[cursor]!='w') return false;
    cursor++;

    return true;
  }
}