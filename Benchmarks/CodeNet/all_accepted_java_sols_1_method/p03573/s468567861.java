import java.util.*;

public class Main {
    public static void main(String[] args) {
      
      Scanner scanner = new Scanner(System.in);
      
      String input_text = scanner.nextLine();
      String[] str = input_text.split(" ");
 
		int x = Integer.parseInt(str[0]);
  		int y = Integer.parseInt(str[1]);
  		int z = Integer.parseInt(str[2]);
      	
        int ans = x;
  		if (x == y) {
    		ans = z;
  		} else if (x == z) {
   			ans = y;
  		}
 		System.out.println(ans);
    }
}