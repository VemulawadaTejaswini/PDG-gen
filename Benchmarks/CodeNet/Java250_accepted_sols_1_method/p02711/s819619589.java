import java.util.*;

public class Main {
	public static void main(String args[]) {
    	Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
      	for (char c : s.toCharArray()) {
        	if (c == '7') {
            	System.out.println("Yes");
                return;
            }
        }
        System.out.println("No");
    }
}