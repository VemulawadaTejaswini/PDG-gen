import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String S = sc.nextLine();
    String a;
    if(S.charAt(2) == S.charAt(3) && S.charAt(4) == S.charAt(5)){
      a = "Yes";
    } else {
      a = "No";
    }
    System.out.println(a);
  }
}