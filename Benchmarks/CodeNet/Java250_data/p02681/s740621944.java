import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    	String befId = sc.next();
    	String aftId = sc.next();
    
     String modId = aftId.substring(0, aftId.length()-1);
   	/* modId.setLength(aftId.length()-1);*/
    
    if(befId.equals(modId)) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}