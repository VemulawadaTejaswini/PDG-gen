import  java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int heights[] = new int[n];
    for(int i = 0; i < n; i++) heights[i] = scan.nextInt();
    scan.close();
    
    int prev = -1;
    boolean judge = true;
    for(int height : heights) {
      if(prev == -1) {
        prev = height;
        continue;
      }
      
      if(prev < height - 1) {
    	  prev = height - 1;
    	  continue;
      }
      
      if(prev > height ) {
        judge = false;
        continue;
      }
    }
    if(judge) {
      System.out.println("Yes");
    } else {
      System.out.println("No");
    }
  }
}
