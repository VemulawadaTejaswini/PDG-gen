import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
	a=a.replace("1","q");
    a=a.replace("9","l");
    a=a.replace("q","9");
    a=a.replace("l","1");
    System.out.println(a);
  }
}