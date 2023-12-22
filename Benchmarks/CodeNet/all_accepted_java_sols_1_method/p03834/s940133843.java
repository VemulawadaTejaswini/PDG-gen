import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String s = scan.next();
    String w = s.replaceAll("[,]"," ");
    System.out.println(w);
  }
}
