import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    
    int max = Math.max(Math.max(A, B), C);
    int gap = 3 * max - A - B - C;
    
    System.out.println(gap % 2 == 0 ? gap / 2 : (gap+3) / 2);
  }
}