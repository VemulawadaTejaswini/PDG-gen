import java.util.Scanner;

public class Main {
	
	public static int searchLinear(int[] nums, int[] queries) {
		
		int answer = 0;
		
		for (int i = 0; i < queries.length; i++) {
			int query = queries[i];
			for (int j = 0; j < nums.length; j++) {
				if (query == nums[j]) {
					answer++;
					break;
				}
			}
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arrLen = scan.nextInt();
		scan.nextLine();
		int[] a = new int[arrLen];
		
		for (int i = 0; i < arrLen; i++) {
			a[i] = scan.nextInt();
		}
		scan.nextLine();
		
		int querLen = scan.nextInt();
		scan.nextLine();
		int[] b = new int[querLen];
		
		for (int i = 0; i < querLen; i++) {
			b[i] = scan.nextInt();
		}
		
		scan.close();

		int answer = searchLinear(a, b);
		
		System.out.println(answer);
	}
}
