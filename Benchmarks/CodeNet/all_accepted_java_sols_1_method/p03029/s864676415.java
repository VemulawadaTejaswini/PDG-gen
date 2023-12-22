import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    
    int a = scan.nextInt();
    int p = scan.nextInt();
    
    int ans = (a*3+p)/2;
    
    System.out.println(ans);
  }
}