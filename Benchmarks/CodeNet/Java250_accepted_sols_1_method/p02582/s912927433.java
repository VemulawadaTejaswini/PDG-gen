import java.util.*;
public class Main {
	public static void main(String... args) {
    	Scanner input = new Scanner(System.in);
        
        String str = input.next();
        
        int ans = 0;
        if (str.contains("RRR")) {
        	ans = 3;
        } else if (str.contains("RR")) {
        	ans = 2;
        } else if (str.contains("R")) {
        	ans = 1;
		}
        
        System.out.println(ans);
	}
}