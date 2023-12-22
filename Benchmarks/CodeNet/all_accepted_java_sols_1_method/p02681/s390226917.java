import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a = sc.next();
    String b = sc.next();
    String c = b.substring(0,a.length());
    String d = b.substring(a.length());
    if ( a.equals(c) && d.length() == 1) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
 