import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    char[] chars = scanner.nextLine().toCharArray();
    if(chars[2] == chars[3]
     &&chars[4] == chars[5])
      System.out.println("Yes");
    else
      System.out.println("No");
  }
}