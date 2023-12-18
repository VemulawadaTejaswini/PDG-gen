import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    String judge = T.substring(0,S.length());
    if (S.equals(judge)){
      System.out.println("Yes");
    }else{
      System.out.println("No");
    }
  }
}