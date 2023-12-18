import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String S = scan.nextLine();
    String T = scan.nextLine();
    String answer = "No";
    if(T.contains(S)){
      if(S.length() + 1 == T.length())
        answer = "Yes";
    }
    System.out.println(answer);
  }
}