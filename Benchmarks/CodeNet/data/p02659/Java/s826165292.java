import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    long a = scan.nextLong();
    double b = scan.nextDouble();
    String t = b+"";
    long t1 = Integer.parseInt(String.valueOf(t.charAt(0)));
    long t2 = Integer.parseInt(String.valueOf(t.charAt(2)));
    long t3 = Integer.parseInt(String.valueOf(t.charAt(3)));
    long c = (a*t1*100)+(a*t2*10)+(a*t3);
    double e = c/100;
    long d = (long) e;
    System.out.println(d);
  }
}
