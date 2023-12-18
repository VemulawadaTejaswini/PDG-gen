import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    alpha = scan.next();
    code = int(alpha);
    if (65<=code<=90){
      System.out.println("A");
    }else{
      System.out.println("a");
    }
  }
}