import java.util.Scanner;

class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    
    String s = sc.next();
    String t = sc.next();
    
    sc.close();
    
    String temp = t.substring(0, t.length() - 1);
    String answer = s.equals(temp) ? "Yes" : "No";
    System.out.println(answer);
  }
}