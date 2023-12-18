import java.util.*;
import static java.lang.System.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int[] nums = new int[10];
		String s;
		
		while (sc.hasNext()) {
			
			s = sc.next();
			for (int i=0; i<10; i++) {
				nums[i] = Character.getNumericValue(s.charAt(i));
			}
			
			for (int i=0; i<9; i++) {
				for (int j=0; j<9-i; j++) {
					nums[j] = (nums[j]+nums[j+1])%10;
				}
			}
			
			out.println(nums[0]);
			
		}
	}
}
