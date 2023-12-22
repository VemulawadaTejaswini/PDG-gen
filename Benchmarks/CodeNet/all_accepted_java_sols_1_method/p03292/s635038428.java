import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int A1 = scan.nextInt();
		int A2 = scan.nextInt();
		int A3 = scan.nextInt();
		scan.close();
		
		int max = 0;
		int mid = 0;
		int min = 0;
		if (A1 > A2) {
			max = A1;
			min = A2;
		} else {
			max = A2;
			min = A1;
		}
		
		if (max < A3) {
			max = A3;
			mid = max;
		} else {
			mid = A3;
		}
		
		if (mid < min) {
			int tmp = mid;
			mid = min;
			min = tmp;
		}
		
		int ans1 = 0;
		ans1 = mid - max;
		if (ans1 < 0) {
			ans1 = ans1 * -1;
		}
		
		int ans2 = 0;
		ans2 = min - mid;
		if (ans2 < 0) {
			ans2 = ans2 * -1;
		}
		System.out.print(ans1 + ans2); 
	}
}
