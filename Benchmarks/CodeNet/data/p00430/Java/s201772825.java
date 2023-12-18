import java.util.Scanner;
import java.util.Stack;

/**
 * AIZU ONLINE JUDGE 507
 */

public class Main {
	private int n;
	private Stack<Integer> state;
	
	private Main() {
		Scanner in = new Scanner(System.in);
		while(true) {
			this.n = in.nextInt();
			if(n==0) break;
			state = new Stack<Integer>();
			backtrack(n, state);
		}
	}
	
	private boolean check(Stack<Integer> state, int value) {
		int sum = 0;
		for(int i:state) {
			sum += i;
		}
		if(sum+value > this.n){
			return false;
		} else {
			return true;
		}
	}
	
	private void backtrack(int n, Stack<Integer> state) {
		int sum = 0;
		for(int i:state) {
			sum += i;
		}
		if(sum == this.n){
			StringBuilder stream = new StringBuilder("");
			for(int i:state) {
				stream.append(i+" ");
			}
			System.out.println(stream);
			return;
		}
		for(int i = this.n;i>0;i--) {
			if((!state.empty()) && (state.peek() < i)) {
				// 最右の列がのその左側の列より少なくなる場合
			}else if(check(state,i)) {
				state.push(i);
				backtrack(i-1,state);
				state.pop();
			}
		}
		return;
	}
	
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		new Main();
	}

}