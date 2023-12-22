import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String n = scan.next();
    if (n.contains("7") == true){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}