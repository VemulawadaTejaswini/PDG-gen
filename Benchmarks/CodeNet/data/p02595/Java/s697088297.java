import java.util.*;

public class Main {
  public static void main(String[] args) {
  	
    try (Scanner scan = new Scanner(System.in)) {
      
      int n = scan.nextInt();
      int d = scan.nextInt();
      int result = 0;
      for (int i = 0; i < n; i++) {
      	result += calc(d, scan);
      }
      System.out.println(result);
    }
  }
  
  private static int calc(int d, Scanner scan) {
  	if (Math.sqrt(Math.pow(scan.nextInt(), 2) + Math.pow(scan.nextInt(), 2)) <= d) {
    	return 1;
    }
    
    return 0;
  }
}