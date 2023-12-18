import java.util.LinkedList;
import java.util.Scanner;

public class Main{

	public static void main(String args[]){
		new Main().mainrun();
	}

	Scanner scan;

	private int N;
	private final long MOD = 1000000007;
	private Node[] node;

	private void mainrun() {
		scan = new Scanner(System.in);

		N = scan.nextInt();

		node = new Node[N];

		for(int i = 0;i < N;i++) {
			node[i] = new Node(scan.next());
		}

		for(int i = 0;i < N-1;i++) {
			node[scan.nextInt()-1].child.add(scan.nextInt()-1);
		}

		System.out.println(looprun(node[0]) % MOD);

		scan.close();
	}

	private long looprun(Node n) {
		long ans = 1;

		switch(n.type) {

		case "E":
			for(Integer no : n.child) {
				ans *= looprun(node[no]);
				ans %= MOD;
			}

			if(n.isOption) {
				ans += 1;
			}
			break;

		case "R":
			for(Integer no : n.child) {
				ans *= looprun(node[no]) + 1;
				ans %= MOD;
			}

			if(!n.isOption) {
				ans -= 1;
			}

			break;

		case "A":

			for(Integer no : n.child) {
				ans += looprun(node[no]);
			}

			if(!n.isOption) {
				ans -= 1;
			}
			break;
		}

		return ans;
	}
}

class Node{
	String type;
	boolean isOption;
	LinkedList<Integer> child;

	Node(String str){
		String[] sp = str.split("");
		type = sp[0];
		isOption = (sp.length == 2);
		child = new LinkedList<>();
	}
}

