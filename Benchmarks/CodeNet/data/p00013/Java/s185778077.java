import java.util.*;
public class Main {
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<Integer>();
		Stack<Integer> q = new Stack<Integer>();
		
		int count = 0;
		for(;;) {
			int num = stdIn.nextInt();
			if(num == 0) {
				int temp = q.pop();
				list.add(temp);
			} else {
				q.add(num);
				count++;
			}
			if(count == 10) break;
		}
		for(int r = 0; r < list.size(); r++) {
			System.out.println(list.get(r));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}