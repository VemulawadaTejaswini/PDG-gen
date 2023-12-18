import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
//		System.out.println("Started");
		Main main = new Main();
		main.process();
	}
	
	public void process() {
		int nodeNum = 0, queryNum = 0;
		Node[] nodes;
		Scanner scanner = new Scanner(System.in);
		nodeNum = scanner.nextInt();
		queryNum = scanner.nextInt();
		nodes = makeSet(nodeNum);
		for(int i = 0; i < queryNum; i++) {
//			System.out.println("i = " + i);
			int command = scanner.nextInt();
//			System.out.print("com: " + command);
			Node target1 = nodes[scanner.nextInt()];
			Node target2 = nodes[scanner.nextInt()];
//			System.out.println(", t1: " + target1.getNum() + ", t2: " + target2.getNum());
			if(command == 0) union(target1, target2);
			else if(command == 1) same(target1, target2);
			else System.err.println("Input command is wrong!!");
		}
	}
	
	public void same(Node x, Node y) {
//		System.out.println("Process " + x.getNum() + " and " + y.getNum() + " same?");
		if(findSet(x).equals(findSet(y))) System.out.println("1");
		else System.out.println("0");
	}
	
	public Node[] makeSet(int x) {
		Node[] nodes = new Node[x];
		for(int i = 0; i < x; i++) nodes[i] = new Node(i);
		return nodes;
	}
	
	public void union(Node x, Node y) {
//		System.out.println("Process " + x.getNum() + " and " + y.getNum() + " union!");
		link(findSet(x), findSet(y));
	}
	
	public void link(Node x, Node y) {
		if(x.getRank() > y.getRank()) y.point(x);
		else {
			x.point(y);
			if(x.getRank() == y.getRank()) y.setRank(y.getRank() + 1);
		}
	}
	
	public Node findSet(Node x) {
		if(x != x.point()) x.point(findSet(x.point()));
		return x.point();
	}

	private class Node{
		private int rank = 0;
		private int num = 0;
		private Node destination;
		public Node(int num) {
			this.num = num;
			this.destination = this;
		}
		public void setRank(int rank) {
			this.rank = rank;
		}
		public int getNum() {
			return this.num;
		}
		public int getRank() {
			return this.rank;
		}
		public void point(Node node) {
			this.destination = node;
		}
		public Node point() {
			return this.destination;
		}
	}
}
