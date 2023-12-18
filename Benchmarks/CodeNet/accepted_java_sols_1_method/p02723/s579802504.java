import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    
    String str = scanner.next();
    String answer = "No";
    if(str.charAt(2) == str.charAt(3)){
      if(str.charAt(4) == str.charAt(5)){
        answer = "Yes";
      }
    }
    System.out.println(answer);
  }
}