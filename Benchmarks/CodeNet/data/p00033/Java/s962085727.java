import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private Scanner in = new Scanner(System.in);
	
	private Main() {
		int n = in.nextInt();
		int numOfBall = 10;
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> dataset = new ArrayList<Integer>();	
			for(int j=0;j<numOfBall;j++) {
				 dataset.add(in.nextInt());
			}
			int[] cylinders = new int[2]; //筒(の最後の要素)
			System.out.println(solve(dataset, cylinders));
		}
		
	}
	
	private String solve(ArrayList<Integer> dataset,int[] cylinders) {
		if(dataset.isEmpty())
			return "YES";
		
		int head = dataset.remove(0);
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