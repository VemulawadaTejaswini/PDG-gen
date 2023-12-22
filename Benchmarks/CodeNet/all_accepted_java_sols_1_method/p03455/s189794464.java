import java.util.*;
public class Main {
  public static void main(String args[]) {
	Scanner scn = new Scanner(System.in);
    String result;
    
    
    if (scn.nextInt() % 2 == 0) {
    	result = "Even";
    } else {
        if (scn.nextInt() % 2 == 0) {
          result = "Even";
        } else {
          result = "Odd";
        }
    }
    
    System.out.println(result);
  }
}
