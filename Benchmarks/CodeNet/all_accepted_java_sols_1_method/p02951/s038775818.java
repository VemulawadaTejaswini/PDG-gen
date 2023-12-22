import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int a = scan.nextInt();
    int b = scan.nextInt();
    int c = scan.nextInt();
    scan.close();
    
    int ans = c - (a - b);
   	if(ans < 0) ans = 0;
    
    System.out.println(ans);
   
  }
}