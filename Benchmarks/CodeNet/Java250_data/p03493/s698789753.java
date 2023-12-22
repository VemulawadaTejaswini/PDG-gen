import java.util.*;

public class Main {
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    
    int s = sc.nextInt();
    
    int s1 = s / 100;
    int s2 = (s - (s1 * 100)) / 10;
    int s3 = (s - (s1 * 100) - (s2 * 10));
    
    System.out.println(s1 + s2 + s3);
  }
}