import java.util.*;

class Main {
	public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int count = sc.nextInt();
    int maxCount = 0;
    int currentCount = 0;
    int previousHeight = 0;
    
    for (int i = 0; i < count; i++) {
      if (i == 0) {
        previousHeight = sc.nextInt();
        continue; 
      }
      
      int currentHeight = sc.nextInt();
      if (previousHeight >= currentHeight) {
        currentCount++;
      } 
      else {
        maxCount = Math.max(maxCount, currentCount);
        currentCount = 0;
      }
      previousHeight = currentHeight;
    }
    
    System.out.println(Math.max(maxCount, currentCount));
	}
}
