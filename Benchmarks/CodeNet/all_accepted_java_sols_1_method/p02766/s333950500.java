import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int M = sc.nextInt();
    
    long n = Long.parseLong(N, 10);
    String ans = Long.toString(n, M);
    System.out.println(ans.length());
  }
}