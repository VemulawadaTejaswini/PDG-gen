import java.util.Scanner;

public class Main{
  public static void main(String... args){
    Scanner scanner = new Scanner(System.in);
    String text = scanner.next();
    
    if(text.charAt(text.length - 1) == '?'){
        text = text.substring(0, text.length - 1) + "D";
    }
    
    while(text.indexOf("?") > -1){
        text = text.replaceAll("P\\?", "PD");
        text = text.replaceAll("\\?D", "PD");
    }
    
    System.out.println(text);
  }
}