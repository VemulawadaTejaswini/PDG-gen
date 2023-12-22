import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
//    String a = sc.next();  // input String
    if (a>b){
      System.out.println(2*a-1);
    } else if (a==b){
      System.out.println(2*a);
    } else {
      System.out.println(2*b-1);
    }
  }
}
