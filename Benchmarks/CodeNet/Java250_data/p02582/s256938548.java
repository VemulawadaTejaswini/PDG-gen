import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String S = sc.next();
    int r;
    
    if (S.indexOf("RRR") != -1) {
      r = 3;
    }else if (S.indexOf("RR")  != -1) {
      r = 2;
    }else if (S.indexOf('R') != -1) {
      r = 1;
    }else{
      r = 0;
    }
    
    System.out.println(r);
  }
}