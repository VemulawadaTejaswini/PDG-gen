import java.util.Scanner;

public class Main {
  public static void main(String[] args ){
    Scanner sc = new Scanner(System.in);

    char ch = (char)( ((int)sc.next().charAt(0)) + 1 );

    System.out.println(ch);

  }
}
