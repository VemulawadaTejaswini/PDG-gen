import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    String S = sc.next();
    String T = S.replaceAll("ABC", ".");
    System.out.println((S.length()-T.length())/2);
  }
}