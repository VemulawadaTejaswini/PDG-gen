import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    String answer = "No";
    if(T.contains(S)){
      if(T.length() - S.length() == 1)
        answer = "Yes";
    }
    System.out.println(answer);
  }
}