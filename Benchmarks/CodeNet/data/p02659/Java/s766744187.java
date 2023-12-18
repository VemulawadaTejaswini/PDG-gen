import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    
    Scanner scan = new Scanner(System.in);
    float A = scan.nextFloat();
    float B = scan.nextFloat();
    
    float C = Math.floor(A*B);
    
    System.out.println(C);
  }
}
