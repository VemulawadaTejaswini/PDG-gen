import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    char start = str.charAt(0);
    char end = str.charAt(str.length()-1);
    System.out.print(start);
    System.out.print(str.length()-2);
    System.out.println(end);
  }
}
