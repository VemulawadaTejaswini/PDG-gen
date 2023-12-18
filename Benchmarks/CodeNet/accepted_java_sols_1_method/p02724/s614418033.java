import java.util.*;
import java.io.BufferedInputStream;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner (new BufferedInputStream(System.in));
    long n = sc.nextLong();
    System.out.println( n / 500 * 1000 + (n % 500) / 5 * 5);
  }
}
