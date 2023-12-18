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
    String c = sc.next();
    System.out.println(a.substring(0,1)+b.substring(1,2)+c.substring(2));
  }
}