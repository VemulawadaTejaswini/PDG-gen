import java.util.Scanner;
 
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String T=sc.next();
    String t=T.replace("?", "D");
    System.out.println(t);
  }
}