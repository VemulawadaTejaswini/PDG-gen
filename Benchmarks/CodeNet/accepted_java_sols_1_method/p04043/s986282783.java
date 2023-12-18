import java.util.*;

public class Main{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int[] nums = new int[3];
		for (int i = 0; i < 3; i++) nums[i] = in.nextInt();
		
		int fives = 0, sevens = 0;
		for (int i = 0; i < 3; i++) {
			if (nums[i] == 5) fives++;
			if (nums[i] == 7) sevens++;
		}
		
		if (sevens == 1 && fives == 2) System.out.println("YES");
		else System.out.println("NO");
	}
}
