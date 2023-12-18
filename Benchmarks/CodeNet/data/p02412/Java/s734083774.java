import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static int count = 0;
	static int[] selectedNum = new int[3];
	static int n;
	static int x;
	
	static void saiki(int index) {
		if (index == selectedNum.length) {
			int sum = 0;
			for (int num : selectedNum) {
				sum += num;
			}
			
			if (sum == x) {
				count++;
			}
			return;
		}
		
		int startNum = 1;
		
		if (index != 0) {
			startNum = selectedNum[index-1] + 1;
		}
		
		for (int i = startNum; i <= n; i++) {
			selectedNum[index] = i;
			saiki(index + 1);
		}
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		List<Integer> answers = new ArrayList<Integer>(); 
		
		while (true) {
			n = scan.nextInt();
			x = scan.nextInt();

			if (n == 0 && x == 0) {
				break;
			}
			
			count = 0;
			saiki(0);
			answers.add(count);
		}

		for (Integer ans : answers) {
			System.out.println(ans);
		}
		
		scan.close();
	}

}