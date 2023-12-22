import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    
    int ab = Math.abs(b - a);
    int bc = Math.abs(c - b);
    int ca = Math.abs(a - c);
    
    if (a <= b && b <= c) {
      System.out.println(ab + bc);
    } else if (a <= c && c <= b) {
      System.out.println(ca + bc);
    } else if (b <= a && a <= c) {
      System.out.println(ab + ca);
    } else if (b <= c && c <= a) {
      System.out.println(bc + ca);
    } else if (c <= a && a <= b) {
      System.out.println(ca + ab);
    } else if (c <= b && b <= a) {
      System.out.println(bc + ab);
    }
  }
}