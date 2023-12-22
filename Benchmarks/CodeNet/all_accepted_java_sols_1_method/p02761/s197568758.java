import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if (n == 0) {
			System.out.println(0);
			return;
		}
		char[] nums = new char[n];
		for (int i = 0; i < n; i++) nums[i] = '0';
		int m = scan.nextInt();
		
		for (int i = 0; i < m; i++) {
			int pos = scan.nextInt()-1;
			int num = scan.nextInt();
			if ((nums[pos] != '0' && (char) (num + '0') != nums[pos]) || (pos == 0 && num == 0) && n != 1) {
				System.out.println(-1);
				return;
			}
			nums[pos] = (char) ('0' + num);
		}
		
		if (n == 1) {
			System.out.println(String.valueOf(nums));
			return;
		}
		
		
		if (nums[0] == '0') nums[0] = (char) ('0' + 1);
		
		System.out.println(String.valueOf(nums));
		
	}

}