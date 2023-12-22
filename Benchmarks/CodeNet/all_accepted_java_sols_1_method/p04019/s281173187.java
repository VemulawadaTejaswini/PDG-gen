import java.util.*;

class Main{
  static boolean n,s,w,e;
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    char[] carr = scan.next().toCharArray();
    for(char c : carr) {
      if(c=='N') n = true;
      if(c=='S') s = true;
      if(c=='W') w = true;
      if(c=='E') e = true;
    }

    System.out.println((!(n^s)&&!(w^e))?"Yes":"No");
  }
}
