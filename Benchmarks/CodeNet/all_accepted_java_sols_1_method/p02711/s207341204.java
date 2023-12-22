import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    String S;
    if(N.charAt(0)=='7' || N.charAt(1)=='7' || N.charAt(2)=='7'){
      S = "Yes";
    } else {
      S = "No";
    }
    System.out.println(S);
  }
}