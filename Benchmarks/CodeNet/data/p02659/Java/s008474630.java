import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    long a = sc.nextLong();  // input Integer
//    String a = sc.next();  // input String
    double b = sc.nextDouble();
    double m = a*b;
    System.out.println((long) m);
  }
}