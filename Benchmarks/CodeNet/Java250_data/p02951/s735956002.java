import java.util.*;

public class Main{
  public static void main(String args[]){
    Scanner scanner = new Scanner(System.in);
    int A = scanner.nextInt();
    int B = scanner.nextInt();
    int C = scanner.nextInt();
    
    int result = 0;
    int amount = A - (B + C);
    if(amount < 0){
      result = (B + C) - A;
    }
    
    System.out.println(result);
  }
}
