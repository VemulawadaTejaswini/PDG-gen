import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    String str = scan.next();
    
    if(str.substring(str.length() - 1).equals("s")){
      str += "es";
    } else {
      str += "s";
    }
    
    System.out.println(str);	
  }
}