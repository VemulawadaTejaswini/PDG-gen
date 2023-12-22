import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    
    Scanner sc = new Scanner(System.in);
    
    int n = sc.nextInt();
    String str = sc.next();
    
    if (str.length() <= n)
      System.out.println(str);
    else {
      String temp = str.substring(0, n);
      System.out.println(temp + "...");
    }
    
  }
}
      