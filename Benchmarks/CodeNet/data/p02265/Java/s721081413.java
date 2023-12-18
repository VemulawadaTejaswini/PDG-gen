import java.util.LinkedList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		LinkedList<Integer> ll = new LinkedList<Integer>();
		int n = scan.nextInt();
		
		for (int i = 0; i < n; i++) {
			String op = scan.next();
			
			if ("deleteFirst".equals(op)) {
				ll.pollFirst();
			}
			else if ("deleteLast".equals(op)) {
				ll.pollLast();
			}
			else if ("insert".equals(op)){
				int num = scan.nextInt();
				ll.offerFirst(num);
			}
			else if ("delete".equals(op)){
				int num = scan.nextInt();
				ll.remove((Integer)num);
			}
		}

		Integer[] nums = ll.toArray(new Integer[0]);
		
		for (int i = 0; i < nums.length; i++) {
			System.out.print(nums[i]);
			if (i != nums.length-1) {
				System.out.print(" ");
			}
		}
		System.out.println();
		
		scan.close();
	}

}