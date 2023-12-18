import java.util.*;
 
public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    int a = scanner.nextInt();
    int b = scanner.nextInt();
    if (a >= 13) {
      System.out.println(b + "\n");
    } else if (a < 13 && a >= 6) {
      System.out.println((b / 2) + "\n");
    } else {
      System.out.println("0\n");
    }
  }
}