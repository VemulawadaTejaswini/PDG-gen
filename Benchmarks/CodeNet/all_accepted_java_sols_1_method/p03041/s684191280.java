import java.util.*;
class Main {
  public static void main(String[] args) {
    Scanner stdIn = new Scanner(System.in);
    int n = stdIn.nextInt();
    int k = stdIn.nextInt();
    String s = stdIn.next();
    String s1 = s.substring(0,k-1);
    String s2 = s.substring(k-1,k).toLowerCase();
    String s3 = s.substring(k,n);
    String s4 = s1+s2+s3;
    System.out.println(s4);
  }

}