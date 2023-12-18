import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
//    int a = sc.nextInt();  // input Integer
    String a = sc.next();  // input String
    if (a.equals("A")){
      System.out.println("T");
    } else if (a.equals("T")){
      System.out.println("A");
    } else if (a.equals("C")){
      System.out.println("G");
    } else {
      System.out.println("C");
    }
  }
}