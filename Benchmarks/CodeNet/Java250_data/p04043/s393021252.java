import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[11];
		for (int i = 0; i < 3; i++) {
			int num = sc.nextInt();
			nums[num]++;
		}
		
		if (nums[5] == 2 && nums[7] == 1) System.out.println("YES");
		else System.out.println("NO");
		
		sc.close();
	}
}

