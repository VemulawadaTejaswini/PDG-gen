import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    double b = scan.nextDouble();
    double c = a*b;
    long d = (long) c;
    System.out.println(d);
  }
}
