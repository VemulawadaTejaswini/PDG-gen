import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String S[] = s.split("");
    System.out.print(S[0]);
    System.out.print(S.length-2);
    System.out.print(S[S.length-1]);
    System.out.println();
  }
}
