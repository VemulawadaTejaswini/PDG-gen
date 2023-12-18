
import java.util.ArrayDeque;
import java.util.Scanner;

/**
 * Aizu 0033
 */
public class Main {
	private Scanner in = new Scanner(System.in);
	private int numOfBall = 10;
	
	private Main() {
		int n = in.nextInt();
		
		for(int i=0; i<n; i++) {
			ArrayDeque<Integer> dataset = new ArrayDeque<Integer>();	
			int[] tmpData = new int[numOfBall];
			for(int j=0;j<numOfBall;j++) {
				tmpData[j] = in.nextInt();
			}
			for(int j=numOfBall-1;j>0;j--) {
				dataset.push(tmpData[j]);
			}
			int[] cylinders = new int[2]; //筒(の最後の要素)
			System.out.println(solve(dataset, cylinders));
		}
		
	}
	
	private String solve(ArrayDeque<Integer> dataset, int[] cylinders) {
		if(dataset.isEmpty())
			return "YES";
		
		int head = dataset.pop();
		if(head > cylinders[0]) {
			cylinders[0] = head;
		} else if(head > cylinders[1]) {
			cylinders[1] = head;
		} else {
			return "NO";
		}
		return solve(dataset, cylinders);
	}

	public static void main(String[] args) {
		new Main();
	}

}