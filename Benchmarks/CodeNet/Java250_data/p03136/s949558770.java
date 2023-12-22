import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
 
public class Main {
  public static void main(String... args) {
  	Scanner sc = new Scanner(System.in);
    Integer[] lines = new Integer[sc.nextInt()];
    
    for(int i = 0; sc.hasNext(); i++) {
      lines[i] = sc.nextInt();
    }
    
    List<Integer> list = Arrays.asList(lines);
    
    if(Collections.max(list) >= sum(list)) {
    	System.out.println("No");
    } else {
    	System.out.println("Yes");
    }
  }
  
  public static int sum(List<Integer> values) {
    int sum = 0;
    
    for(int value : values) {
      sum += value;
    }
    
    return sum - Collections.max(values);
  }
}