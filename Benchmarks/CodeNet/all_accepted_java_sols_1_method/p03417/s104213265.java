import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    long n = Long.parseLong(sc.next());
    long m = Long.parseLong(sc.next()); 
    
    System.out.println(Math.abs((n - 2) * (m - 2)));
  }
}