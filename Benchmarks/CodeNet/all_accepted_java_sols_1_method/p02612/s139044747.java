import java.util.*;


public class Main {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();
    int ans =1000 - n % 1000;
    if(ans == 1000){
      ans = 0;
    }

    
    
    System.out.println(ans);
    
    scanner.close();
    return;
  }
  
}
