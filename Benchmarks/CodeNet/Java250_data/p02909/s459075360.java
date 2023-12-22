import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);    
 	String s = sc.next();
    String result = "";
    
    if ("Sunny".equals(s)) {
      result = "Cloudy";
    } else if ("Cloudy".equals(s)) {
      result = "Rainy";
    } else if ("Rainy".equals(s)) {
      result = "Sunny";
    }
    
    
    System.out.println(result);
  }
}

