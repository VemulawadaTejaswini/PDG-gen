import java.util.*;
import java.math.*;

public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = sc.nextLong();
    long a = sc.nextLong();
    long b = sc.nextLong();

    long sum = a+b;

    long w = n/sum;
    long p = n%sum;


    System.out.println(w*a+Math.min(p,a));


  }
}
