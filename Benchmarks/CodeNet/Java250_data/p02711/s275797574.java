import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    String inputStr = sc.nextLine();
    
    String regex = "[7]";
    Pattern p = Pattern.compile(regex);
    Matcher m = p.matcher(inputStr);

    if (m.find()) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  
  } 
}