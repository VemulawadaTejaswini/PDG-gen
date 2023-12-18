import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		String s;
		int total = 0;
		
		while (sc.hasNext()) {
			s = sc.next();
			String[] nums = s.split("[^0-9]+");
			
			for (int i=0; i<nums.length; i++) {
				if (nums[i].isEmpty()) {continue;}
				total += Integer.parseInt(nums[i]);
			}
		}
		
		out.println(total);
	}
}
