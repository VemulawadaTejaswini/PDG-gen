import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    String N = scanner.next();
    boolean a = N.charAt(0) == '7' || N.charAt(1) == '7' || N.charAt(2) == '7';
    String answer = a ? "Yes" : "No";
    System.out.println(answer);
  }
}