

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.io.StreamTokenizer;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;

import javax.swing.plaf.synth.SynthStyle;

public class Main {

	class Node{

		@Override
		public int hashCode() {
			// TODO Auto-generated method stub
			return super.hashCode();
		}

		private int id;
		private int parent;
		private int depth;
		private String type;
		private ArrayList<Integer> children = new ArrayList<>();

		public Node(int id) {
			this.id = id;
			this.parent = -1;
		}

		public int getId() {
			return id;
		}

		public int getDepth() {
			return depth;
		}

		public void setDepth(int depth) {
			this.depth = depth;
		}

		public String getType() {
			return type;
		}

		public void setType(String type) {
			this.type = type;
		}

		public int getParent() {
			return parent;
		}

		public void addChild(Integer child) {
			children.add(child);
		}

		public void setType() {
			if (parent == -1) {
				type = "root";
			} else if (children.size() == 0) {
				type = "leaf";
			} else {
				type = "internal node";
			}
		}
		
		public void setParent(int parent) {
			this.parent = parent;
		}

		@Override
		public boolean equals(Object obj) {
			Node node = (Node) obj;
			if (this.id == node.getId()) {
				return true;
			} else {
				return false;
			}

		}

		@Override
		public String toString() {
			setType();
			return "node " + id + ": " + "parent = " + parent + ", depth = " + depth + ", " + type + ", " + children;
		}

	}

	HashMap<Integer, Node> nodes = new HashMap<>();
	private void solv() {
		Scanner input = new Scanner(System.in);
		int n = input.nextInt();
		
		for (int i = 0; i < n; i++) {
			Node parentNode;
			int parentId = input.nextInt();
			if (nodes.containsKey(parentId)) {
				parentNode = nodes.get(parentId);
			} else {
				parentNode = new Node(parentId);
			}

			int cn = input.nextInt();
			for (int j = 0; j < cn; j++) {
				Node childNode;
				int childId = input.nextInt();
				if (nodes.containsKey(childId)) {
					childNode = nodes.get(childId);
				} else {
					childNode = new Node(childId);
				}
				
				childNode.setParent(parentId);
				parentNode.addChild(childId);
				nodes.put(childId, childNode);
			}

			if (!nodes.containsKey(parentId)){
				nodes.put(parentId, parentNode);
			}
		}

		for (int key : nodes.keySet()) {
			nodes.get(key).setDepth(calcDepth(nodes.get(key), 0));
			System.out.println(nodes.get(key));
		}
	}
	
	public int calcDepth(Node parent, int depth){
		if (parent.getParent() == -1) {
			return depth;
		}else{
			return calcDepth(nodes.get(parent.getParent()), ++depth);
		}
	}

	public class NodeComparator implements Comparator<Node> {
		@Override
		public int compare(Node n1, Node n2) {
			return n1.getId() < n2.getId() ? -1 : 1;
		}
	}

	public static void main(String[] args) {
		Main main = new Main();
		main.solv();
	}

	private void print(Object[] xs) {
		StringBuilder sb = new StringBuilder();
		for (Object x : xs)
			sb.append(x.toString()).append(' ');
		System.out.println(sb.toString().trim());
	}

	private void print(int[] xs) {
		StringBuilder sb = new StringBuilder();
		for (int i = 1; i < xs.length; i++) {
			sb.append(xs[i]).append(' ');
		}
		System.out.println(sb.toString().trim());
	}

	private static class Scanner {
		BufferedReader r;
		StreamTokenizer st;

		public Scanner(InputStream in) {
			r = new BufferedReader(new InputStreamReader(in));
			st = new StreamTokenizer(r);
		}

		public String next() {
			nextToken();
			return st.sval;
		}

		public Integer nextInt() {
			nextToken();
			return (int) st.nval;
		}

		private int nextToken() {
			int token = st.TT_EOF;
			try {
				token = st.nextToken();
			} catch (IOException e) {
			}
			return token;
		}
	}

}