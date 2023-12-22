import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    // 準備
    Scanner sc = new Scanner(System.in);
    String s = sc.next();

    char c = (char)(s.charAt(0) + 1);

    System.out.println(c);

  }
}