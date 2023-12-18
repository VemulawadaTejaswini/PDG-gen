import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    int a = sc.nextInt();
    int b = sc.nextInt();
    
    int aPlusB = a + b;
    
    if (aPlusB >= 24) {
      System.out.println(aPlusB - 24);
    } else {
      System.out.println(aPlusB);
    }
  }
}