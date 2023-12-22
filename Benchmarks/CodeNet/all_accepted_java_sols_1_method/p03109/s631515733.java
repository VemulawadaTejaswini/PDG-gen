import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
	String a = sc.next();
    String b = a.substring(5,7);
    int n = Integer.parseInt(b);
    if (n>4) {
      System.out.println("TBD");
    } else {
      System.out.println("Heisei");
    }
  }
}