import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();  // input Integer
    int b = sc.nextInt();  // input Integer
    int t = sc.nextInt();  // input Integer
    //    String a = sc.next();  // input String
    int now = 0;
    now+=a;
    int count=0;
    while (now<=t){
      now+=a;
      count+=b;
    }
    System.out.println(count);
  }
}