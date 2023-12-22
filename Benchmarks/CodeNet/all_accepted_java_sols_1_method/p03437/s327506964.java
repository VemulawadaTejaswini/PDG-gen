import java.util.*;

public class Main {
  	static Scanner scanner = new Scanner(System.in);
  
	public static void main(String[]$) {
      	int x = scanner.nextInt(), y = scanner.nextInt();
    	System.out.println(x % y == 0 ? -1 : x);
    }
}