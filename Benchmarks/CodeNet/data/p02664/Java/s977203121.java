import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner();
    
    String string = sc.next();
    string = string.replace("?", "D");
    
    System.out.println(string);
  }
}