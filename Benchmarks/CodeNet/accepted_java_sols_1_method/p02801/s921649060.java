import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    String s = sc.next();
    char[] c = s.toCharArray();
    c[0]  += 1;
    System.out.println(c[0]);
  }
}