import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
	int aPlusB = a + b;
    
    if (a % 3 == 0 || b % 3 == 0 || aPlusB % 3 == 0) {
      System.out.println("Possible");
    } else {
      System.out.println("Impossible");
    }
  }
}