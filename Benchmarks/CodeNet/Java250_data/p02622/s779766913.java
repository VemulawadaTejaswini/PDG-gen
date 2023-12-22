import java.util.Scanner;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    String S = scanner.next();
    String T = scanner.next();
    int count = 0;
    for(int i = 0;i < S.length();i++){
      if(S.charAt(i) == T.charAt(i)) continue;
      count++;
    }
    System.out.println(count);
  }
}