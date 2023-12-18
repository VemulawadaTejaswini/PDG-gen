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
    String c = a.substring(2)+a.substring(1,2)+a.substring(0,1);
    if (b.equals(c)){
      System.out.println("YES");
    } else {
      System.out.println("NO");
    }
  }
}