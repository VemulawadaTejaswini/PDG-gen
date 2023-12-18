import java.util.Scanner;
 
public class Main {
  public static void main(String[] args ) {
    Scanner sc = new Scanner(System.in);
    int hiki = sc.nextInt();
    int asi = sc.nextInt();
    
    if (asi%2==1 || hiki*4<asi || hiki*2>asi) {
      System.out.println("No");
    } else {
      System.out.println("Yes");
    } 
  }
}

