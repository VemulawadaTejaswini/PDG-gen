import java.util.*;

public class Main {
  
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();
		
		int min = x - k + 1;
		int max = x + k - 1;
		int size = max - min + 1;
		
		String result = String.valueOf(min);
			
		if (size != 1) {
			
			for (int i = 1; i < size - 1; i ++) {
				result = result + " " + String.valueOf(min + i);
			}
		
			result = result + " " + String.valueOf(max);
		}
		
		System.out.println(result);
    
  }
  
}