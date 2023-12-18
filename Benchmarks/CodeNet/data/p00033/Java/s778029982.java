
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	private Scanner in = new Scanner(System.in);
	
	private Main() {
		int n = in.nextInt();
		
		for(int i=0;i<n;i++) {
			ArrayList<Integer> dataset = new ArrayList<Integer>();	
			for(int j=0;j<10;j++) {
				 dataset.add(in.nextInt());
			}
			int[] cylinders = new int[2];
			backtrack(dataset, cylinders); //筒(の最後の要素)
		}
		
	}
	
	private void backtrack(ArrayList<Integer> data,int[] cylinders) {
		if(data.isEmpty()) {
			System.out.println("YES");
			return;
		}
		
		int head = data.get(0);
		
		if(head > cylinders[0]) {
			cylinders[0] = head;
			data.remove(0);
			backtrack(data,cylinders);
		} else if(head > cylinders[1]) {
			cylinders[1] = head;	
			data.remove(0);
			backtrack(data,cylinders);
		} else {
			System.out.println("NO");
			return;
		}
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		new Main();
	}

}