import java.util.Scanner;


public class Main {
  public static void main(String[] args ) throws Exception {
    Scanner sc = new Scanner(System.in);
    String S = sc.next();
    String T = sc.next();
    String tt = T.substring(0,T.length()-1);
    System.out.println(S);
    System.out.println(tt);
    if(S.equals(tt)) {
		System.out.println("Yes");
    } else {
		System.out.println("No");
    }


  }
}