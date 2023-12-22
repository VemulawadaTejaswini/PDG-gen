import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String t = sc.next();
    if((s.charAt(0)==t.charAt(2)) && (s.charAt(1) == t.charAt(1)) && (s.charAt(2) == t.charAt(0))){
      System.out.println("YES");
    }else{
      System.out.println("NO");
    }
  }
}
