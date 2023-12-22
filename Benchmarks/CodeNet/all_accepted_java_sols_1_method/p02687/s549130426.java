import java.util.Scanner;

public class Main {
  
  public static void main(String[] args){
    Scanner scan =new Scanner(System.in);
    String n=scan.next();
    
    if(n.equals("ABC")){
      System.out.println("ARC");
    }else if(n.equals("ARC")){
      System.out.println("ABC");
    }
  }
}