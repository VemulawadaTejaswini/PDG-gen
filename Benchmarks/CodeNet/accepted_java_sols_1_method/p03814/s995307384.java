import java.util.*;

public class Main {

  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    String x = sc.next();
    int f =0;
    int l =0;
    for (int i=0; i<x.length(); i++) {
      if (x.charAt(i) == 'A') {
        f = i;
        break;
      }
    }
    for (int i=x.length()-1; i>=0; i--) {
      if (x.charAt(i) == 'Z') {
        l = i;
        break;
      }
    }
    System.out.println(l-f+1);
  }
}